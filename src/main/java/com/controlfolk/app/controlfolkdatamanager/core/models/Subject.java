package com.controlfolk.app.controlfolkdatamanager.core.models;

import com.controlfolk.app.controlfolkdatamanager.data.jpa.subjects.SubjectEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor(staticName = "empty")
public class Subject {

    private String id;

    private String name;

//    public static Subject of(String id,String name){
//        return new Subject(id,name);
//    }

}
