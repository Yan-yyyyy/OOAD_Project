package com.sustech.service.impl;
import com.sustech.dao.ManagerDao;
import com.sustech.domain.Customer;
import com.sustech.domain.Manager;
import com.sustech.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    ManagerDao managerDao;

    @Override
    public Boolean loginCheck(String userid, String password) {
        Manager c = managerDao.getByIDAndPsw(userid, password);
        return c != null;
    }

//    @Override
//    public Boolean register(Manager user) {
//        Manager byID = managerDao.getByID(user.getId(),user.getHotel_id());
//        if(byID != null){
//            return false;
//        }
//        return managerDao.insertCustomer(user);
//    }
}