package com.example.demo1.controller;

import com.example.demo1.Result.Result;
import com.example.demo1.logindemo.dao.AccountMapper;
import com.example.demo1.logindemo.model.Account;
import com.example.demo1.logindemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/accountJsonController")
@RestController
public class AccountJsonController {
    @Autowired
    DemoService demoService;

    @Autowired
    AccountMapper accountMapper;

//    @GetMapping(value = "/api/account")
//    public Result getUser(Integer id) {
//        List<Account> list=demoService.selectAll();
//
//        return new Result("200",list,"null");
//    }
//    @GetMapping(value = "/api/UserInfo")
//    public Result getUserInfo(Integer id) {
//        //List<Account> list=demoService.selectAll();
//        List<Account> list=accountMapper.selectById(id);
//        return new Result("200",list,"null");
//    }

}
