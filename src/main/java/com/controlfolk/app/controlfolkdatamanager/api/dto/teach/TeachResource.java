package com.controlfolk.app.controlfolkdatamanager.api.dto.teach;

import com.controlfolk.app.controlfolkdatamanager.api.dto.subjects.SubjectResource;
import com.controlfolk.app.controlfolkdatamanager.api.dto.users.UserResource;
import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import com.controlfolk.app.controlfolkdatamanager.core.models.Teach;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
public class TeachResource {
    private String id;

    private UserResource user;

    private SubjectResource subject;

    public static TeachResource of(Teach teach){
        return new TeachResource(
                teach.getId(),
                UserResource.of(teach.getUser()),
                SubjectResource.of(teach.getSubject())
        );
    }
}
