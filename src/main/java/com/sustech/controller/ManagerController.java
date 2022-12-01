package com.sustech.controller;
//import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import com.sustech.domain.Hotel;
import com.sustech.domain.Manager;
import com.sustech.domain.Order;
import com.sustech.domain.Result;
import com.sustech.exception.MyException;
import com.sustech.service.ManagerService;
import com.sustech.service.OrderService;
import com.sustech.service.impl.ManagerServiceImpl;
import com.sustech.service.impl.OrderServiceImpl;
import com.sustech.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/hotel/manager")
@CrossOrigin
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    private OrderService orderService;

    @GetMapping("/login/{id}/{password}")
    public Result login(@PathVariable String id, @PathVariable String password){
        Boolean flag = managerService.loginCheck(id, password);
        if(flag) {
            return ResultUtil.success();
        }
        return ResultUtil.error("User name or password is wrong!");
    }
//    @PostMapping("/register")
//    public Result register(@RequestBody Manager manager){
//        // 处理body中默认值是null的情况
//        Boolean flag = managerService.register(manager);
//        if(!flag){
//            throw new MyException(100, "Your customer Id already exists!");
//        }
//        return ResultUtil.success();
//    }
//    @GetMapping("/orders")
//    public List<Order> getAll() throws MessagingException, IOException {
////        return orderService.getAllOrders();
//    }
    @PostMapping("/endOrders")
    public Result endOrders(@RequestBody Order order){
        return ResultUtil.success();
    }

}