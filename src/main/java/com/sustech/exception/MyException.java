package com.sustech.exception;

import lombok.Data;

@Data
public class MyException extends RuntimeException{
    private int code;
    private String msg;

    public MyException(int code, String message) {
        super(message);
        this.code = code;
        this.msg = message;
    }
}
