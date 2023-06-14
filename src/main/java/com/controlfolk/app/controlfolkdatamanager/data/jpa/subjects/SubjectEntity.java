package com.controlfolk.app.controlfolkdatamanager.data.jpa.subjects;

import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor(staticName = "empty")
@AllArgsConstructor(staticName = "of")
@Document(collation = "subject")
public class SubjectEntity {
    @Id
    private String id;

    private String name;

    public static SubjectEntity of(Subject subject){
        return new SubjectEntity(
                subject.getId(),
                subject.getName()
        );
    }

    public Subject toModel(){
        return Subject.of(
                this.id,
                this.name
        );
    }
}
