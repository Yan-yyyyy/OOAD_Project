package com.sustech.dao;

import com.sustech.domain.Manager;
import com.sustech.service.ManagerService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface ManagerDao {
    @Select("select * from Manager where id = #{id} and password = #{password}")
    public Manager getByIDAndPsw(String id, String password);

    @Select("select * from manager where id = #{id} and hotel_id = #{hotel_id}")
    public Manager getByID(String id, Integer hotel_id);

    @Insert("insert into manager(id, password, name,hotel_id) values " +
            "(#{id}, #{password}, #{name}, #{hotel_id})")
    public Boolean insertCustomer(Manager manager);
}