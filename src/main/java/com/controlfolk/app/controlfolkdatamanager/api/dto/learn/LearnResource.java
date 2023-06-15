package com.controlfolk.app.controlfolkdatamanager.api.dto.learn;

import com.controlfolk.app.controlfolkdatamanager.api.dto.subjects.SubjectResource;
import com.controlfolk.app.controlfolkdatamanager.api.dto.users.UserResource;
import com.controlfolk.app.controlfolkdatamanager.core.models.Learn;
import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
public class LearnResource {
    private String id;

    private UserResource user;

    private SubjectResource subject;

    private double qualification;

    public static LearnResource of(Learn learn){
        return new LearnResource(
                learn.getId(),
                UserResource.of(learn.getUser()),
                SubjectResource.of(learn.getSubject()),
                learn.getQualification()
        );
    }
}
