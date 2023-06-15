package com.controlfolk.app.controlfolkdatamanager.api.response.rol;

import com.controlfolk.app.controlfolkdatamanager.api.dto.roles.RolResource;
import com.controlfolk.app.controlfolkdatamanager.api.dto.users.UserResource;
import com.controlfolk.app.controlfolkdatamanager.api.response.BaseResponse;

import java.util.List;

public class RolResponse extends BaseResponse<RolResource> {
    public RolResponse(String messages){super(List.of(messages));}
    public RolResponse(String messages, Integer code){super(List.of(messages),code);}
    public RolResponse(String messages, RolResource response){super(List.of(messages),response);}
    public RolResponse(String messages, RolResource response,Integer count){
        super(List.of(messages),response,count);
    }
}
