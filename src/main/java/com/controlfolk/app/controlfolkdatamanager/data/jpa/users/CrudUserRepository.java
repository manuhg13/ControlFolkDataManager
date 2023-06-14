package com.controlfolk.app.controlfolkdatamanager.data.jpa.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CrudUserRepository extends CrudRepository<UserEntity,String> {
}
