package com.sustech.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sustech.domain.Hotel;

import java.util.List;

public interface HotelService {

    public List<Hotel> getAllHotels();

    public Boolean insertAHotel(Hotel hotel);
}
