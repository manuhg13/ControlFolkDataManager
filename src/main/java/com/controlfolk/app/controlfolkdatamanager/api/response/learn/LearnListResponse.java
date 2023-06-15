package com.controlfolk.app.controlfolkdatamanager.api.response.learn;

import com.controlfolk.app.controlfolkdatamanager.api.dto.learn.LearnResource;
import com.controlfolk.app.controlfolkdatamanager.api.response.BaseResponse;

import java.util.List;

public class LearnListResponse extends BaseResponse<List<LearnResource>> {
    public LearnListResponse(String messages){super(List.of(messages));}
    public LearnListResponse(String messages, Integer code){super(List.of(messages),code);}
    public LearnListResponse(String messages, List<LearnResource> response){super(List.of(messages),response);}
    public LearnListResponse(String messages, List<LearnResource> response,Integer count){
        super(List.of(messages),response,count);
    }
}
