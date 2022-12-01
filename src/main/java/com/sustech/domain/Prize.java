package com.sustech.domain;

import lombok.Data;

@Data
public class Prize {
    private Integer prize_id;
    private String name;
    private String photo;
    private Integer integral_cost;
}
