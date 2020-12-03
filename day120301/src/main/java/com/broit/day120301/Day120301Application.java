package com.broit.day120301;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(basePackages = {"com.broit.day120301.mapper"})
@SpringBootApplication
public class Day120301Application {

    public static void main(String[] args) {
        SpringApplication.run(Day120301Application.class, args);
    }

}
