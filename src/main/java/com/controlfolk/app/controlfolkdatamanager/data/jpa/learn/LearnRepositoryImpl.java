package com.controlfolk.app.controlfolkdatamanager.data.jpa.learn;

import com.controlfolk.app.controlfolkdatamanager.core.models.Learn;
import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import com.controlfolk.app.controlfolkdatamanager.core.ports.LearnRepository;
import com.controlfolk.app.controlfolkdatamanager.data.jpa.subjects.SubjectEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
@Slf4j
@Repository
@RequiredArgsConstructor
public class LearnRepositoryImpl implements LearnRepository {

    private final CrudLearnRepository crudLearnRepository;
    @Override
    public Flux<Learn> findAllBySubject(Subject subject) {
        return Flux.defer(()-> Flux.fromIterable(crudLearnRepository.findAllBySubject(subject)))
                .map(LearnEntity::toModel);
    }
}
