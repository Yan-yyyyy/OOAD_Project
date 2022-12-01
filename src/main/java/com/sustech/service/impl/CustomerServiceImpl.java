package com.sustech.service.impl;

import com.sustech.dao.CustomerDao;
import com.sustech.domain.Customer;
import com.sustech.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerDao customerDao;

    @Override
    public Boolean loginCheck(String userid, String password) {
        Customer c = customerDao.getByIDAndPsw(userid, password);
        return c != null;
    }

    @Override
    public Boolean register(Customer user) {
        Customer byID = customerDao.getByID(user.getId());
        if(byID != null){
            return false;
        }
        return customerDao.insertCustomer(user);
    }

}
