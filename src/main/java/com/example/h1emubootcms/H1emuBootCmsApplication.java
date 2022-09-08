package com.example.h1emubootcms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class H1emuBootCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(H1emuBootCmsApplication.class, args);
    }
}
