package com.sustech;

import com.sustech.dao.CustomerDao;
import com.sustech.domain.Customer;
import com.sustech.domain.Hotel;
import com.sustech.service.HotelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OoadProjectApplicationTests {

    @Autowired
    CustomerDao customerDao;
    @Autowired
    HotelService hotelService;
    @Test
    void contextLoads() {
    }

    @Test
    void testgetByIDAndPsw(){
        Customer ans = customerDao.getByIDAndPsw("12012407", "wwy");
        System.out.println(ans);
    }

    @Test
    void testGetAllHotel(){
        System.out.println(hotelService.getAllHotels());
    }

    @Test
    void testInsertAHotel(){
//        Hotel hotel = new Hotel();
//        hotel.setId(2);
//        hotel.setName("超级无敌大酒店");
//        hotel.setProvince("辽宁省");
//        hotel.setCity("大连市");
//        hotel.setDetail_address("XXXXXXX");
//        hotel.setPhoto("https://p2.itc.cn/c_lfill,w_310,h_206,g_face,q_70/images03/20221115/6de6fafa95d04f6d885d34504f36783d.jpeg");
//        hotel.setPhone("182xxxxxx");
//        hotelService.insertAHotel(hotel);
    }

}
