package com.controlfolk.app.controlfolkdatamanager.core.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor(staticName = "empty")
public class User {

    private String id;

    private String name;

    private String surname;

    private String email;

    private String password;

    private String username;

    private LocalDate date;

    private Rol rol;

    public static User of(String id, String name, String surname, String email, String password, String username, LocalDate date, Rol rol) {
        return new User(id,name,surname,email,password,username,date,rol);
    }
}
