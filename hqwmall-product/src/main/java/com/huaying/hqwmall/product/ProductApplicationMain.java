package com.huaying.hqwmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("com.huaying.hqwmall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplicationMain {

    public static void main(String[] arr){

        SpringApplication.run(ProductApplicationMain.class,arr);


    }
}
