package com.learn.exception;

public class NotValidCardException extends Exception {

    public NotValidCardException(String msg){
        super(msg);
    }
}
