package com.controlfolk.app.controlfolkdatamanager.core.ports;

import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public interface UsesRepository {
    Mono<User> findById(String id);

    Mono<User> create(User user, LocalDate date,Rol rol);

    Mono<Void> delete(String id);
}
