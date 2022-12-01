package com.sustech.controller;

import com.sustech.domain.Customer;
import com.sustech.utils.Result;
import com.sustech.exception.MyException;
import com.sustech.service.CustomerService;
import com.sustech.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * 因为账号密码会暴露, 所以login也使用post请求------ form-data
     */
    @PostMapping("/login")
    public Result login(@RequestParam("id") String customerId,
                        @RequestParam("password") String password){
        // 处理异常输入
        if(customerId.length() == 0 || password.length() == 0 ){
            return ResultUtil.error("User name or password is wrong!");
        }
        // 在数据库查找用户
        Boolean flag = customerService.loginCheck(customerId, password);
        if(flag) {
            return ResultUtil.success();
        }
        return ResultUtil.error("User name or password is wrong!");
    }

    @PostMapping("/register")
    public Result register(@RequestBody Customer customer){
        // 处理异常输入
        if(customer.getId() == null || !(customer.getId() + "").matches("^\\d{8}$")){
            return ResultUtil.error("User id or password is wrong!");
        }
        if(customer.getPassword() == null || customer.getPassword().length() == 0){
            return ResultUtil.error("User id or password is wrong!");
        }
        if(customer.getName() == null || customer.getName().length() == 0){
            return ResultUtil.error("Please input valid name!");
        }
        // 这里的银行卡必要吗？ 感觉没必要。1、不知道别人的银行卡号是不是对的 2、支付的时候也不一定要用银行卡
        if(customer.getIdentity_card() == null || customer.getIdentity_card().length() == 0){
            return ResultUtil.error("Identity_card wrong!");
        }
        // 给用户余额和积分赋初始值0
        customer.setBalance(0);
        customer.setIntegral(0);
        Boolean flag = customerService.register(customer);
        if(!flag){
            return ResultUtil.error("The customer Id already exists!");
        }
        return ResultUtil.success();
    }

//    @PostMapping("/register")
//    public Result register(@RequestBody Customer customer){
//        Boolean flag = customerService.register(customer);
//        if(!flag){
//            throw new MyException(100, "Your customer Id already exists!");
//        }
//        return ResultUtil.success();
//    }
}