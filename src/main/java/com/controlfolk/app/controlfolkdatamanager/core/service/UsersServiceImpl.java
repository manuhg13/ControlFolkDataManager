package com.controlfolk.app.controlfolkdatamanager.core.service;

import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import com.controlfolk.app.controlfolkdatamanager.core.ports.UsersService;
import com.controlfolk.app.controlfolkdatamanager.core.ports.UsesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Slf4j
@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsesRepository usesRepository;
    @Override
    public Mono<User> findById(String id) {
        return null;
    }

    @Override
    public Mono<User> create(User user, LocalDate date, Rol rol) {
        return null;
    }
}
