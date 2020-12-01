package com.example.demo1.logindemo.dao;

import com.example.demo1.logindemo.model.AccountAndAccountType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountAndAccountTypeMapper {

    List<AccountAndAccountType> selectAll();

    List<AccountAndAccountType> selectById(@Param("id") Integer id);
}