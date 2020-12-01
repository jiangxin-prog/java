package com.example.demo1.logindemo.service;

import com.example.demo1.logindemo.model.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DemoService {
    Account selectCount(Account account);
    List<Account> selectAll(Account account, Integer startIndex, Integer pageSize);
    List<Account> selectList(Account account);
    Account selectById(@Param("id") int id);
    int add(Account account);
        int updateById(Account account);
    int deleteById(@Param("id") int id);
}
