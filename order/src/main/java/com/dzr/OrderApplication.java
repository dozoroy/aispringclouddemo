package com.dzr;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dzr.repository")
public class OrderApplication {
    public static  void main(String[] args){
        SpringApplication.run(OrderApplication.class,args);
    }
}