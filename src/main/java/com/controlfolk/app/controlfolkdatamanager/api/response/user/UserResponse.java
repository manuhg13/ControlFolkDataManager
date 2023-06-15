package com.controlfolk.app.controlfolkdatamanager.api.response.user;

import com.controlfolk.app.controlfolkdatamanager.api.dto.users.UserResource;
import com.controlfolk.app.controlfolkdatamanager.api.response.BaseResponse;

import java.util.List;

public class UserResponse extends BaseResponse<UserResource> {
    public UserResponse(String messages){super(List.of(messages));}
    public UserResponse(String messages, Integer code){super(List.of(messages),code);}
    public UserResponse(String messages, UserResource response){super(List.of(messages),response);}
    public UserResponse(String messages, UserResource response,Integer count){
        super(List.of(messages),response,count);
    }
}
