package com.example.demo1.logindemo.service.imp;

import com.example.demo1.logindemo.dao.AccountTypeMapper;
import com.example.demo1.logindemo.model.AccountType;
import com.example.demo1.logindemo.service.AccountTypeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountTypeServiceImpl implements AccountTypeService {

    @Autowired
    AccountTypeMapper accountTypeMapper;

    @Override
    public List<AccountType> selectAll() {
        return  accountTypeMapper.selectAll();
    }
    @Override
        public List<AccountType> selectById(@Param("id") Integer id){
        return  accountTypeMapper.selectAll();
    }
}
