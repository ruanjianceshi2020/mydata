package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("com.itheima.mapper")
@SpringBootApplication
public class Chapter03Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter03Application.class, args);
    }

}
