package com.example.demo1.logindemo.service.imp;

import com.example.demo1.logindemo.dao.AccountMapper;
import com.example.demo1.logindemo.model.Account;
import com.example.demo1.logindemo.service.DemoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account selectCount(Account account){
        return  accountMapper.selectCount(account);
    }

    @Override
    public List<Account> selectAll(Account account,Integer startIndex,Integer pageSize) {
        return  accountMapper.selectAll(account,startIndex,pageSize);
    }

    @Override
    public List<Account> selectList(Account account) {
        return  accountMapper.selectList(account);
    }

    @Override
    public Account selectById(@Param("id") int id){
        return  accountMapper.selectById(id);
    }

    @Override
    public int add(Account account) {

        return accountMapper.add(account);
    }
    @Override
    public int updateById(Account account) {return accountMapper.updateById(account);}

    @Override
    public int deleteById(@Param("id") int id){
        return  accountMapper.deleteById(id);
    }
}
