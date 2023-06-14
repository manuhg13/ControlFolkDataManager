package com.controlfolk.app.controlfolkdatamanager.data.jpa.subjects;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CrudSubjectRepository extends ReactiveCrudRepository<SubjectEntity,String> {
}
