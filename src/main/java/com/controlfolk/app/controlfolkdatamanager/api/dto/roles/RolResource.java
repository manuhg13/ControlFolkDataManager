package com.controlfolk.app.controlfolkdatamanager.api.dto.roles;

import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
public class RolResource {
    private String id;

    private String rol;

    private String description;

    public static RolResource of(Rol rol){
        return  new RolResource(
                rol.getId(),
                rol.getRol(),
                rol.getDescription()
        );
    }
}
