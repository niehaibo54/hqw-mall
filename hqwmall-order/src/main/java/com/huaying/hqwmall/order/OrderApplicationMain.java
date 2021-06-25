package com.huaying.hqwmall.order;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("com.huaying.hqwmall.order.dao")
@SpringBootApplication
//@EnableDiscoveryClient
public class OrderApplicationMain {

    public static void main(String[] arr){

        SpringApplication.run(OrderApplicationMain.class,arr);


    }

}
