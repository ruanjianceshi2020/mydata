package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@ServletComponentScan  // 开启基于注解方式的Servlet组件扫描支持
@SpringBootApplication
public class Chapter05Application extends SpringBootServletInitializer {
    // 3、程序主类继承SpringBootServletInitializer，并重写configure()方法
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Chapter05Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Chapter05Application.class, args);
    }

}
