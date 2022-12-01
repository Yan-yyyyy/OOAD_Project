package com.sustech.domain;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private Object data;
}
