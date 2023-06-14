package com.controlfolk.app.controlfolkdatamanager.core.service;

import com.controlfolk.app.controlfolkdatamanager.core.models.Learn;
import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import com.controlfolk.app.controlfolkdatamanager.core.ports.LearnRepository;
import com.controlfolk.app.controlfolkdatamanager.core.ports.LearnService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
@Slf4j
@Service
@RequiredArgsConstructor
public class LearnServiceImpl implements LearnService {

    private final LearnRepository learnRepository;

    @Override
    public Flux<Learn> findAllBySubject(Subject subject) {
        return learnRepository.findAllBySubject(subject);
    }
}
