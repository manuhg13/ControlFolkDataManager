package com.controlfolk.app.controlfolkdatamanager.core.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor(staticName = "empty")
public class Teach {
    private String id;

    private User user;

    private Subject subject;

    public static Teach of(String id,User user,Subject subject){
        return new Teach(id,user,subject);
    }

}
