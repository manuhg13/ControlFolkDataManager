package com.controlfolk.app.controlfolkdatamanager.data.jpa.subjects;

import org.springframework.data.repository.CrudRepository;

public interface CrudSubjectRepository extends CrudRepository<SubjectEntity,String> {

    SubjectEntity findByName(String name);
}
