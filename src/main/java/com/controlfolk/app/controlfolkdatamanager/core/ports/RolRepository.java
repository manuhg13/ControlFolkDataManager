package com.controlfolk.app.controlfolkdatamanager.core.ports;

import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
import reactor.core.publisher.Mono;

public interface RolRepository {
    Mono<Rol> create(Rol rol);

    Mono<Void> delete(Rol rol);

    Mono<Rol> findByRol(String rol);
}
