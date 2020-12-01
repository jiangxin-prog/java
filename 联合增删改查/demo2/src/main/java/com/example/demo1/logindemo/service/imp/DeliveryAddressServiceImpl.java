package com.example.demo1.logindemo.service.imp;

import com.example.demo1.logindemo.dao.AccountMapper;
import com.example.demo1.logindemo.dao.DeliveryAddressMapper;
import com.example.demo1.logindemo.model.DeliveryAddress;
import com.example.demo1.logindemo.service.DeliveryAddressService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {

    @Autowired
    DeliveryAddressMapper deliveryAddressMapper;

    @Override
    public List<DeliveryAddress> selectAll(DeliveryAddress deliveryAddress) {
        return  deliveryAddressMapper.selectAll(deliveryAddress);
    }
    @Override
    public DeliveryAddress selectById(@Param("id") int id){
        return  deliveryAddressMapper.selectById(id);
    }

    @Override
    public int add(DeliveryAddress deliveryAddress) {
        return deliveryAddressMapper.add(deliveryAddress);
    }
    @Override
    public int updateById(DeliveryAddress deliveryAddress) {return deliveryAddressMapper.updateById(deliveryAddress);}

    @Override
    public int deleteById(@Param("id") int id){
        return  deliveryAddressMapper.deleteById(id);
    }
}
