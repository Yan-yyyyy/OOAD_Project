package com.sustech.service;

import com.sustech.domain.Customer;
import com.sustech.domain.Manager;

public interface ManagerService {
    public Boolean loginCheck(String userid, String password);

//    public Boolean register(Manager user);
}