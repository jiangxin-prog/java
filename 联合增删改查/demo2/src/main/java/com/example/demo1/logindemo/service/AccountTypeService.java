package com.example.demo1.logindemo.service;

import com.example.demo1.logindemo.model.AccountType;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface AccountTypeService {

    List<AccountType> selectAll();
    List<AccountType> selectById(@Param("id") Integer id);
}
