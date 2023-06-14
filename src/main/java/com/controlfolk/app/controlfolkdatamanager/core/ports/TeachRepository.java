package com.controlfolk.app.controlfolkdatamanager.core.ports;

import com.controlfolk.app.controlfolkdatamanager.core.models.Teach;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import reactor.core.publisher.Mono;

public interface TeachRepository {
    Mono<Teach> findByUser(User user);
}
