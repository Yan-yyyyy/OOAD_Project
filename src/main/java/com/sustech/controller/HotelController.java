package com.sustech.controller;

import com.sustech.domain.Hotel;
import com.sustech.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotel")
@CrossOrigin
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping("/allHotels")
    public List<Hotel> getAllHotels(){
        return hotelService.getAllHotels();
    }
}
