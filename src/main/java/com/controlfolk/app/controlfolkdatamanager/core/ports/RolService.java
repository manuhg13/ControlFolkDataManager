package com.controlfolk.app.controlfolkdatamanager.core.ports;

import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
import reactor.core.publisher.Mono;

public interface RolService {

    Mono<Rol> create(Rol rol);

    Mono<Void> delete(Rol rol);

    Mono<Rol> findByRol(String rol);

}
