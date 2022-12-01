package com.sustech.domain;

import lombok.Data;

@Data
public class Comment {
    private Integer room_id;
    private Integer hotel_id;
    private String text;
    private String photo;
    private Integer score;
}
