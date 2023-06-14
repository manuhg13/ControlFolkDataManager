package com.controlfolk.app.controlfolkdatamanager.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> {

    private Integer code=null;
    private List<String> messages= null;
    private T response= null;
    private Integer count=null;

    public BaseResponse(List<String> messages){this.messages=messages;}
    public BaseResponse(List<String> messages, Integer code){
        this.messages=messages;
        this.code=code;
    }
    public BaseResponse(List<String> messages, T response){
        this.messages=messages;
        this.response=response;
    }
    public BaseResponse(List<String> messages, T response, Integer count){
        this.messages=messages;
        this.response=response;
        this.count=count;
    }


}
