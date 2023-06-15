package com.controlfolk.app.controlfolkdatamanager.core.models;

import com.controlfolk.app.controlfolkdatamanager.data.jpa.subjects.SubjectEntity;
import com.controlfolk.app.controlfolkdatamanager.data.jpa.users.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor(staticName = "empty")
public class Learn {

    private String id;

    private User user;

    private Subject subject;

    private double qualification;

//    public static Learn of(String id, User user, Subject subject, double qualification) {
//        return new Learn(id,user,subject,qualification);
//    }
}
