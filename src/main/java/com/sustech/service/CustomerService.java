package com.sustech.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sustech.domain.Customer;
import org.springframework.stereotype.Service;

public interface CustomerService {
    public Boolean loginCheck(String userid, String password);

    public Boolean register(Customer user);
}
