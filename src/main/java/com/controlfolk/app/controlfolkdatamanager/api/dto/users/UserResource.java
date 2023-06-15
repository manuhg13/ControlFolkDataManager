package com.controlfolk.app.controlfolkdatamanager.api.dto.users;

import com.controlfolk.app.controlfolkdatamanager.api.dto.roles.RolResource;
import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
public class UserResource {
    private String id;

    private String name;

    private String surname;

    private String email;

    private String password;

    private String username;

    private LocalDate date;

    private RolResource rol;

    public static UserResource of(User user){
        return new UserResource(
                user.getId(),
                user.getName(),
                user.getSurname(),
                user.getEmail(),
                user.getPassword(),
                user.getUsername(),
                user.getDate(),
                RolResource.of(user.getRol())
        );
    }
}
