package com.controlfolk.app.controlfolkdatamanager.core.service;

import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
import com.controlfolk.app.controlfolkdatamanager.core.ports.RolRepository;
import com.controlfolk.app.controlfolkdatamanager.core.ports.RolService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;
    @Override
    public Mono<Rol> create(Rol rol) {
        return null;
    }

    @Override
    public Mono<Void> delete(Rol rol) {
        return null;
    }

    @Override
    public Mono<Rol> findByRol(String rol) {
        return null;
    }
}
