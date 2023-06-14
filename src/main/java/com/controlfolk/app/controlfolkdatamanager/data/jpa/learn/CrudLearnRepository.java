package com.controlfolk.app.controlfolkdatamanager.data.jpa.learn;

import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import com.controlfolk.app.controlfolkdatamanager.data.jpa.subjects.SubjectEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CrudLearnRepository extends CrudRepository<LearnEntity,String> {
    List<LearnEntity> findAllBySubject(Subject subject);
}
