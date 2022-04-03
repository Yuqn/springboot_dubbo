package com.yuqn;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class SpringBootDubbo03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubbo03Application.class, args);
    }

}
