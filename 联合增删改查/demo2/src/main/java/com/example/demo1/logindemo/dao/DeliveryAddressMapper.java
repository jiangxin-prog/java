package com.example.demo1.logindemo.dao;

import com.example.demo1.logindemo.model.DeliveryAddress;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryAddressMapper {
    List<DeliveryAddress> selectAll(DeliveryAddress deliveryAddress);

    DeliveryAddress selectById(@Param("id") int id);

    int add(@Param("deliveryAddress") DeliveryAddress deliveryAddress);

    int updateById(@Param("deliveryAddress") DeliveryAddress deliveryAddress);

    int deleteById(@Param("id") int id);
}