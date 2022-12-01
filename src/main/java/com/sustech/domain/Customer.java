package com.sustech.domain;

import lombok.Data;

@Data
public class Customer {
    private String id;
    private String password;
    private String name;
    private String identity_card;
    private Integer balance;
    private Integer integral;
}
