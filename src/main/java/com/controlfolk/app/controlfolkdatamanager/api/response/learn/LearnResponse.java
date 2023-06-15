package com.controlfolk.app.controlfolkdatamanager.api.response.learn;

import com.controlfolk.app.controlfolkdatamanager.api.dto.learn.LearnResource;
import com.controlfolk.app.controlfolkdatamanager.api.dto.subjects.SubjectResource;
import com.controlfolk.app.controlfolkdatamanager.api.response.BaseResponse;

import java.util.List;

public class LearnResponse extends BaseResponse<LearnResource> {
    public LearnResponse(String messages){super(List.of(messages));}
    public LearnResponse(String messages, Integer code){super(List.of(messages),code);}
    public LearnResponse(String messages, LearnResource response){super(List.of(messages),response);}
    public LearnResponse(String messages, LearnResource response,Integer count){
        super(List.of(messages),response,count);
    }
}
