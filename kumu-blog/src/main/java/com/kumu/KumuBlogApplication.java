package com.kumu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KumuBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(KumuBlogApplication.class,args);
    }
}