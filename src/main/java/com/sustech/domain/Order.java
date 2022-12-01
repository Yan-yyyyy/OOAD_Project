package com.sustech.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Order {
    private Integer order_id;
    private String customer_id;
    private Timestamp check_in_time;
    private Timestamp leave_time;
    private Boolean state;
}
