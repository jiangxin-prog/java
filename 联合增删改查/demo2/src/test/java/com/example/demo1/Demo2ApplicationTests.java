package com.example.demo1;

import com.example.demo1.logindemo.dao.AccountMapper;
import com.example.demo1.logindemo.model.Account;
import javafx.beans.binding.IntegerBinding;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2ApplicationTests {

	@Autowired
	private AccountMapper accountMapper;

	@Test
	void contextLoads() {

//		Integer status = accountMapper.add(new Account(1,1,"xin","111",1,"/123"));
//		System.out.println(status);status
	}

}
