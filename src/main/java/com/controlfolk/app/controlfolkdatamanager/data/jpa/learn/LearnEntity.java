package com.controlfolk.app.controlfolkdatamanager.data.jpa.learn;

import com.controlfolk.app.controlfolkdatamanager.core.models.Learn;
import com.controlfolk.app.controlfolkdatamanager.data.jpa.subjects.SubjectEntity;
import com.controlfolk.app.controlfolkdatamanager.data.jpa.users.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor(staticName = "empty")
@AllArgsConstructor(staticName = "of")
@Document(collection = "learn")
public class LearnEntity {

    @Id
    private String id;

    @DBRef
    private UserEntity user;

    @DBRef
    private SubjectEntity subject;

    private double qualification;

    public static LearnEntity of(Learn learn,UserEntity user,SubjectEntity subject){
        return new LearnEntity(
                learn.getId(),
                user,
                subject,
                learn.getQualification()
        );
    }

    public Learn toModel(){
        return Learn.of(
                this.id,
                this.user.toModel(),
                this.subject.toModel(),
                this.getQualification()
        );
    }



}
