package com.controlfolk.app.controlfolkdatamanager.data.jpa.roles;

import com.controlfolk.app.controlfolkdatamanager.core.models.Rol;
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
@Document(collection = "rols")
public class RolEntity {

    @Id
    private String id;

    private String rol;

    private String description;

    public static RolEntity of(Rol rol){
        return  new RolEntity(
                rol.getId(),
                rol.getRol(),
                rol.getDescription()
        );
    }

    public Rol toModel(){
        return Rol.of(
                this.id,
                this.rol,
                this.description
        );
    }
}
