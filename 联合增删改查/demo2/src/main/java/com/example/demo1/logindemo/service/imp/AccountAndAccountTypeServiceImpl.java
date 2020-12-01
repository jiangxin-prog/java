package com.example.demo1.logindemo.service.imp;

import com.example.demo1.logindemo.dao.AccountAndAccountTypeMapper;
import com.example.demo1.logindemo.model.AccountAndAccountType;
import com.example.demo1.logindemo.service.AccountAndAccountTypeService;
import com.example.demo1.logindemo.service.DemoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountAndAccountTypeServiceImpl implements AccountAndAccountTypeService {

    @Autowired
    AccountAndAccountTypeMapper accountAndAccountTypeMapper;

    @Override
    public List<AccountAndAccountType> selectAll() {
        return  accountAndAccountTypeMapper.selectAll();
    }
    @Override
    public List<AccountAndAccountType> selectById(@Param("id") Integer id){
        return  accountAndAccountTypeMapper.selectAll();
    }
}
