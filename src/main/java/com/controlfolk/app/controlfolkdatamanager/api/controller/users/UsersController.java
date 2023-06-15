package com.controlfolk.app.controlfolkdatamanager.api.controller.users;

import com.controlfolk.app.controlfolkdatamanager.api.dto.learn.LearnResource;
import com.controlfolk.app.controlfolkdatamanager.api.response.learn.LearnListResponse;
import com.controlfolk.app.controlfolkdatamanager.core.errors.NotFoundException;
import com.controlfolk.app.controlfolkdatamanager.core.models.Learn;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import com.controlfolk.app.controlfolkdatamanager.core.ports.LearnService;
import com.controlfolk.app.controlfolkdatamanager.core.ports.SubjectService;
import com.controlfolk.app.controlfolkdatamanager.core.ports.TeachService;
import com.controlfolk.app.controlfolkdatamanager.core.ports.UsersService;
import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    private final LearnService learnService;

    private final SubjectService subjectService;

    private final TeachService teachService;

    @GetMapping("/alumnos")
    public Mono<ResponseEntity<LearnListResponse>> retrieveAlumnos(
           @RequestHeader("uid") String id
    ){
        Mono<User> monoUser= usersService.findById(id);

        Flux<Learn> learnFlux=monoUser
                .switchIfEmpty(Mono.error(new NotFoundException("User not found")))
                .flatMap(user -> teachService.findByUser(user) )
                .switchIfEmpty(Mono.error(new NotFoundException("Teacher not found")))
                .flatMap(teach -> subjectService.findByName(teach.getSubject().getName()))
                .switchIfEmpty(Mono.error(new NotFoundException("Subject not found")))
                .flatMapMany(subject -> learnService.findAllBySubject(subject));

        return learnFlux
                .map(LearnResource::of)
                .switchIfEmpty(Flux.error(new NotFoundException("Alumnos not found")))
                .collectList()
                .map(UsersController::successRetrieveAlumnos)
                .onErrorReturn(NotFoundException.class,UsersController.notFoundAlumnos())
                .onErrorResume(RuntimeException.class,e->{
                    log.error(e.getMessage(),e);
                    return Mono.just(UsersController.listInternalError());
                });
    }

    private static ResponseEntity<LearnListResponse> successRetrieveAlumnos(List<LearnResource> learnResourceList){
        return ResponseEntity.ok(new LearnListResponse("success get alumnos",learnResourceList));
    }

    private static ResponseEntity<LearnListResponse> notFoundAlumnos(){
        return ResponseEntity.ok().body(new LearnListResponse("Not found alumnos",1));
    }

    private static ResponseEntity<LearnListResponse> listInternalError(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new LearnListResponse("Something goes wrong",0));
    }
}
