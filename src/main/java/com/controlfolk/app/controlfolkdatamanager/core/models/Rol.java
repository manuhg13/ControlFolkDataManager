package com.controlfolk.app.controlfolkdatamanager.core.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor(staticName = "empty")
public class Rol {
    private String id;

    private String rol;

    private String description;

}
