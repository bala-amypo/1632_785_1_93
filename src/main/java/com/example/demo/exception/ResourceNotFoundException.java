package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException{
    public class ResourceNotFoundException(String message){
        super(message);
    }

}