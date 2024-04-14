package com.angel.curso.springboot.error.springbooterror.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String mensaje){
        super(mensaje);
    }

}
