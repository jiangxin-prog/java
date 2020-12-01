package com.example.demo1.logindemo.dao;

import com.example.demo1.logindemo.model.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {

    Account selectCount(Account account);

    List<Account> selectAll(@Param("account") Account account,@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize);
    List<Account> selectList(@Param("account") Account account);


    Account selectById(@Param("id") int id);

    int add(@Param("account") Account account);

    int updateById(@Param("account") Account account);

    int deleteById(@Param("id") int id);
}