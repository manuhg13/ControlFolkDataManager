package com.controlfolk.app.controlfolkdatamanager.data.jpa.users;

import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import com.controlfolk.app.controlfolkdatamanager.core.ports.UsesRepository;
import com.controlfolk.app.controlfolkdatamanager.data.jpa.roles.RolEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Slf4j
@Repository
@RequiredArgsConstructor
public class UsersRepositoryImpl implements UsesRepository {

    private final CrudUserRepository crudUserRepository;
    @Override
    public Mono<User> findById(String id) {
        return Mono.defer(()-> Mono.justOrEmpty(crudUserRepository.findById(id)))
                .map(UserEntity::toModel);
    }

    @Override
    public Mono<User> create(User user, LocalDate date, Rol rol) {
        return Mono.defer(()->Mono.just(crudUserRepository.save(UserEntity.of(
                user,
                RolEntity.of(rol),
                date
        )))).map(UserEntity::toModel);
    }
}
