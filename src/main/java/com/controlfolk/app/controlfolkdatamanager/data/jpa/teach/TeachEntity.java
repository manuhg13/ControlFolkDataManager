package com.controlfolk.app.controlfolkdatamanager.data.jpa.teach;

import com.controlfolk.app.controlfolkdatamanager.core.models.Teach;
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
@Document(collection = "teach")
public class TeachEntity  {

    @Id
    private String id;
    @DBRef
    private UserEntity user;
    @DBRef
    private SubjectEntity subject;

    public static TeachEntity of(Teach teach, UserEntity user,SubjectEntity subject){
        return new TeachEntity(
                teach.getId(),
                user,
                subject
        );
    }

    public Teach toModel(){
        return Teach.of(
                this.id,
                this.user.toModel(),
                this.subject.toModel()
        );
    }

}
