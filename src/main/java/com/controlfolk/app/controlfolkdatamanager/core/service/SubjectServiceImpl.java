package com.controlfolk.app.controlfolkdatamanager.core.service;

import com.controlfolk.app.controlfolkdatamanager.core.errors.NotFoundException;
import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import com.controlfolk.app.controlfolkdatamanager.core.ports.SubjectRepository;
import com.controlfolk.app.controlfolkdatamanager.core.ports.SubjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.text.MessageFormat;

@Slf4j
@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    @Override
    public Mono<Subject> create(Subject subject) {
        return subjectRepository.create(subject);
    }

    @Override
    public Mono<Subject> findByName(String name) {
        return subjectRepository.findByName(name)
                .switchIfEmpty(Mono.error(new NotFoundException(MessageFormat.format("Subject {0} not found",name))));
    }
}
