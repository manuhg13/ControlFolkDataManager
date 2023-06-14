package com.controlfolk.app.controlfolkdatamanager.core.ports;

import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import reactor.core.publisher.Mono;

public interface SubjectService {

    Mono<Subject> create(Subject subject);
    Mono<Subject> findByName(String name);

}
