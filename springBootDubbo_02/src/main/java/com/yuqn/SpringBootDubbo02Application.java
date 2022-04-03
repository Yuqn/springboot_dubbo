package com.yuqn;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class SpringBootDubbo02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubbo02Application.class, args);
    }

}
