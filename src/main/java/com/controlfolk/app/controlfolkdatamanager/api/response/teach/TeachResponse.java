package com.controlfolk.app.controlfolkdatamanager.api.response.teach;

import com.controlfolk.app.controlfolkdatamanager.api.dto.subjects.SubjectResource;
import com.controlfolk.app.controlfolkdatamanager.api.dto.teach.TeachResource;
import com.controlfolk.app.controlfolkdatamanager.api.response.BaseResponse;

import java.util.List;

public class TeachResponse extends BaseResponse<TeachResource> {
    public TeachResponse(String messages){super(List.of(messages));}
    public TeachResponse(String messages, Integer code){super(List.of(messages),code);}
    public TeachResponse(String messages, TeachResource response){super(List.of(messages),response);}
    public TeachResponse(String messages, TeachResource response,Integer count){
        super(List.of(messages),response,count);
    }
}
