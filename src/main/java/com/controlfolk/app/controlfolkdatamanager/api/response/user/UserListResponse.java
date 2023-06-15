package com.controlfolk.app.controlfolkdatamanager.api.response.user;

import com.controlfolk.app.controlfolkdatamanager.api.dto.users.UserResource;
import com.controlfolk.app.controlfolkdatamanager.api.response.BaseResponse;

import java.util.List;

public class UserListResponse extends BaseResponse<List<UserResource>> {
    public UserListResponse(String messages){super(List.of(messages));}
    public UserListResponse(String messages, Integer code){super(List.of(messages),code);}
    public UserListResponse(String messages, List<UserResource> response){super(List.of(messages),response);}
    public UserListResponse(String messages, List<UserResource> response,Integer count){
        super(List.of(messages),response,count);
    }
}
