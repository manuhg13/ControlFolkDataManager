package com.controlfolk.app.controlfolkdatamanager.core.service;

import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import com.controlfolk.app.controlfolkdatamanager.core.ports.SubjectRepository;
import com.controlfolk.app.controlfolkdatamanager.core.ports.SubjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    @Override
    public Mono<Subject> create(Subject subject) {
        return null;
    }

    @Override
    public Mono<Subject> findByName(String name) {
        return null;
    }
}
