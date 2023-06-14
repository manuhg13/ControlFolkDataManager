package com.controlfolk.app.controlfolkdatamanager.core.service;

import com.controlfolk.app.controlfolkdatamanager.core.errors.NotFoundException;
import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import com.controlfolk.app.controlfolkdatamanager.core.ports.UsersService;
import com.controlfolk.app.controlfolkdatamanager.core.ports.UsesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.text.MessageFormat;
import java.time.LocalDate;

@Slf4j
@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsesRepository usesRepository;
    @Override
    public Mono<User> findById(String id) {
        return usesRepository.findById(id).switchIfEmpty(Mono.error(new NotFoundException(MessageFormat.format("User {0} not found",id))));
    }

    @Override
    public Mono<User> create(User user, LocalDate date, Rol rol) {
        return usesRepository.create(user,date,rol);
    }

    @Override
    public Mono<Void> delete(String id) {
        return usesRepository.delete(id);
    }
}
