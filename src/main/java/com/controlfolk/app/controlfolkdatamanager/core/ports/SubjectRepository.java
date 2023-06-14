package com.controlfolk.app.controlfolkdatamanager.core.ports;

import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import reactor.core.publisher.Mono;

public interface SubjectRepository {
    Mono<Subject> create(Subject subject);
    Mono<Subject> findByName(String name);
}
