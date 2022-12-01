package com.sustech.domain;

import lombok.Data;

@Data
public class Room {
    private Integer room_id;
    private Integer hotel_id;
    private String type;
    private Integer price;
    private String photo;
    private String state;
}
