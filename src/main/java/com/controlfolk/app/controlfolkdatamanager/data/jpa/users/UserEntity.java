package com.controlfolk.app.controlfolkdatamanager.data.jpa.users;

import com.controlfolk.app.controlfolkdatamanager.core.models.User;
import com.controlfolk.app.controlfolkdatamanager.data.jpa.roles.RolEntity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor(staticName = "empty")
@AllArgsConstructor(staticName = "of")
@Document(collation = "users")
public class UserEntity {

    @Id
    private String id;

    private String name;

    private String surname;

    private String email;

    private String password;

    private String username;

    private LocalDate date;

    private RolEntity rol;

    public static UserEntity of(User user, RolEntity rol,LocalDate date){
        return new UserEntity(
                user.getId(),
                user.getName(),
                user.getSurname(),
                user.getEmail(),
                user.getPassword(),
                user.getUsername(),
                date,
                rol
        );
    }

    public User toModel(){
        return User.of(
            this.id,
            this.name,
            this.surname,
            this.email,
            this.password,
            this.username,
            this.date,
            this.rol.toModel()
        );
    }


}
