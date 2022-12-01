package com.sustech.service.impl;

import com.sustech.dao.HotelDao;
import com.sustech.domain.Hotel;
import com.sustech.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelDao hotelDao;
    @Override
    public List<Hotel> getAllHotels() {
        return hotelDao.getAll();
    }

    @Override
    public Boolean insertAHotel(Hotel hotel) {
        int num = hotelDao.insert(hotel);
//        System.out.println("The inserted num is:"+num);
        return num > 0;
    }
}
