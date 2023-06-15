package com.controlfolk.app.controlfolkdatamanager.api.response.subject;

import com.controlfolk.app.controlfolkdatamanager.api.dto.subjects.SubjectResource;
import com.controlfolk.app.controlfolkdatamanager.api.dto.users.UserResource;
import com.controlfolk.app.controlfolkdatamanager.api.response.BaseResponse;

import java.util.List;

public class SubjectResponse extends BaseResponse<SubjectResource> {
    public SubjectResponse(String messages){super(List.of(messages));}
    public SubjectResponse(String messages, Integer code){super(List.of(messages),code);}
    public SubjectResponse(String messages, SubjectResource response){super(List.of(messages),response);}
    public SubjectResponse(String messages, SubjectResource response,Integer count){
        super(List.of(messages),response,count);
    }
}
