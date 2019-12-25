package com.dzr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dzr.repository")
public class AccountApplication {
    public static  void main(String[] args){
        SpringApplication.run(AccountApplication.class,args);
    }

}