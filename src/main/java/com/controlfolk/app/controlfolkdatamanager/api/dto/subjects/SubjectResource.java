package com.controlfolk.app.controlfolkdatamanager.api.dto.subjects;

import com.controlfolk.app.controlfolkdatamanager.core.models.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor(staticName = "empty")
public class SubjectResource {

    private String id;
    private String name;
    public static SubjectResource of(Subject subject){
        return new SubjectResource(
                subject.getId(),
                subject.getName()
        );
    }
}
