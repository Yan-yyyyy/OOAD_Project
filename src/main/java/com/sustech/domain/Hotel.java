package com.sustech.domain;

import lombok.Data;

@Data
public class Hotel {
    private Integer id;
    private String name;
    private String province;
    private String city;
    private String detail_address;
    private String photo;
    private String phone;
}
