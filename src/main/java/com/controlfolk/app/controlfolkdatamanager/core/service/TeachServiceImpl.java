package com.controlfolk.app.controlfolkdatamanager.core.service;

import com.controlfolk.app.controlfolkdatamanager.core.errors.NotFoundException;
import com.controlfolk.app.controlfolkdatamanager.core.models.Teach;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import com.controlfolk.app.controlfolkdatamanager.core.ports.TeachRepository;
import com.controlfolk.app.controlfolkdatamanager.core.ports.TeachService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.text.MessageFormat;

@Slf4j
@Service
@RequiredArgsConstructor
public class TeachServiceImpl implements TeachService {

    private final TeachRepository teachRepository;
    @Override
    public Mono<Teach> findByUser(User user) {
        return teachRepository.findByUser(user)
                .switchIfEmpty(Mono.error(new NotFoundException(MessageFormat.format("Not found {0}",user))));
    }
}
