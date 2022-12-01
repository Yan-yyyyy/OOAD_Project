package com.sustech.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class FinishedOrder {
    private Integer order_id;
    private String customer_id;
    private Date check_in_date;
    private Date leave_date;
    private Integer total_price;
}
