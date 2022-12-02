package com.example.bookstorebackstagemanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.bookstorebackstagemanagement.mapper")
public class BookStoreBackstageManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreBackstageManagementApplication.class, args);
    }

}
