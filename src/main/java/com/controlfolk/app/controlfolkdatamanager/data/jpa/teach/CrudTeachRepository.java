package com.controlfolk.app.controlfolkdatamanager.data.jpa.teach;

import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import org.springframework.data.repository.CrudRepository;

public interface CrudTeachRepository extends CrudRepository<TeachEntity,String> {
    TeachEntity findByUser(User user);
}
