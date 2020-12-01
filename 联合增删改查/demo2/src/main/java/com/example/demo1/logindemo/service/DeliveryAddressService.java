package com.example.demo1.logindemo.service;

import com.example.demo1.logindemo.model.DeliveryAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DeliveryAddressService {

    List<DeliveryAddress> selectAll(DeliveryAddress deliveryAddress);
    DeliveryAddress selectById(@Param("id") int id);
    int add(DeliveryAddress deliveryAddress);
    int updateById(DeliveryAddress deliveryAddress);
    int deleteById(@Param("id") int id);
}
