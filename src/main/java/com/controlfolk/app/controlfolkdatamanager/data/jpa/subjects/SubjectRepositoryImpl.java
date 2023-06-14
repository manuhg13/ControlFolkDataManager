package com.controlfolk.app.controlfolkdatamanager.data.jpa.subjects;

import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import com.controlfolk.app.controlfolkdatamanager.core.ports.SubjectRepository;
import com.controlfolk.app.controlfolkdatamanager.data.jpa.users.UserEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
@Slf4j
@Repository
@RequiredArgsConstructor
public class SubjectRepositoryImpl implements SubjectRepository {

    private final CrudSubjectRepository crudSubjectRepository;
    @Override
    public Mono<Subject> create(Subject subject) {
        return Mono.defer(()->Mono.just(crudSubjectRepository.save(SubjectEntity.of(subject))))
                .map(SubjectEntity::toModel);
    }

    @Override
    public Mono findByName(String name) {
        return Mono.defer(()-> Mono.justOrEmpty(crudSubjectRepository.findByName(name)))
                .map(SubjectEntity::toModel);
    }
}
