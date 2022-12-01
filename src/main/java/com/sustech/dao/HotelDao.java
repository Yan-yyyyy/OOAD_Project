package com.sustech.dao;

import com.sustech.domain.Hotel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface HotelDao {

    @Select("select * from hotel")
    public List<Hotel> getAll();

    @Insert("insert into hotel(id, name, province, city, detail_address, photo, phone)" +
            "values (#{id}, #{name}, #{province}, #{city}, #{detail_address}, #{photo}, #{phone})")
    public Integer insert(Hotel hotel);
}
