package com.sustech.dao;

import com.sustech.domain.Customer;
import com.sustech.service.CustomerService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerDao {
    @Select("select * from customer where id = #{id} and password = #{password}")
    public Customer getByIDAndPsw(String id, String password);

    @Select("select * from customer where id = #{id}")
    public Customer getByID(String id);

    @Insert("insert into customer(id, password, name, identity_card, balance, integral) values " +
            "(#{id}, #{password}, #{name}, #{identity_card}, #{balance}, #{integral})")
    public Boolean insertCustomer(Customer customer);
}
