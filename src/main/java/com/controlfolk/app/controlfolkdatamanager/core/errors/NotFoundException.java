package com.controlfolk.app.controlfolkdatamanager.core.errors;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}
