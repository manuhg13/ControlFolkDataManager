package com.controlfolk.app.controlfolkdatamanager.core.ports;

import com.controlfolk.app.controlfolkdatamanager.core.models.Learn;
import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import reactor.core.publisher.Flux;

public interface LearnRepository {
    Flux<Learn> findAllBySubject(Subject subject);
}
