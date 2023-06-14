package com.controlfolk.app.controlfolkdatamanager.data.jpa.teach;

import com.controlfolk.app.controlfolkdatamanager.core.models.Teach;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import com.controlfolk.app.controlfolkdatamanager.core.ports.TeachRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
@Slf4j
@Repository
@RequiredArgsConstructor
public class TeachRepositoryImpl implements TeachRepository {

    private final CrudTeachRepository crudTeachRepository;
    @Override
    public Mono<Teach> findByUser(User user) {
        return Mono.defer(()->Mono.justOrEmpty(crudTeachRepository.findByUser(user)))
                .map(TeachEntity::toModel);
    }
}
