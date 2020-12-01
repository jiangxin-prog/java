package com.example.demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan({"com.example.demo1.logindemo.dao"})
public class Demo2Application{

	private static Logger logger = LoggerFactory.getLogger(Demo2Application.class);
	public static void main(String[] args) {
		logger.info("start......");
		SpringApplication.run(Demo2Application.class, args);
	}

}
