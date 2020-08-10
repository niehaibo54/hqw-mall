package com.huaying.hqwmall.order;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.huaying.hqwmall.order.dao")
@SpringBootApplication
public class OrderApplicationMain {

    public static void main(String[] arr){

        SpringApplication.run(OrderApplicationMain.class,arr);


    }

}
