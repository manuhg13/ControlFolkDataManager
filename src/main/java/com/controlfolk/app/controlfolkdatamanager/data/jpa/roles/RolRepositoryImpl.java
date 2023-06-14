package com.controlfolk.app.controlfolkdatamanager.data.jpa.roles;

import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
import com.controlfolk.app.controlfolkdatamanager.core.ports.RolRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Slf4j
@Repository
@RequiredArgsConstructor
public class RolRepositoryImpl implements RolRepository {

    private final CrudRolRepository crudRolRepository;
    @Override
    public Mono<Rol> create(Rol rol) {
        return Mono.defer(()->Mono.just(crudRolRepository.save(RolEntity.of(rol))))
                .map(RolEntity::toModel);
    }

    @Override
    public Mono<Void> delete(Rol rol) {
        return Mono.defer(()->{
            crudRolRepository.deleteById(rol.getId());
            return Mono.empty();
        });
    }

    @Override
    public Mono<Rol> findByRol(String rol) {
        return Mono.defer(()->Mono.justOrEmpty(crudRolRepository.findByRol(rol)))
                .map(RolEntity::toModel);
    }
}
