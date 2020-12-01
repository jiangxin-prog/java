package com.example.demo1.logindemo.dao;

import com.example.demo1.logindemo.model.AccountType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountTypeMapper {

    List<AccountType> selectAll();

    List<AccountType> selectById(@Param("id") Integer id);
}