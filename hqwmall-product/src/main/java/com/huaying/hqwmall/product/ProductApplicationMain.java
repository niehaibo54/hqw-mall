package com.huaying.hqwmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.huaying.hqwmall.product.dao")
@SpringBootApplication
public class ProductApplicationMain {

    public static void main(String[] arr){

        SpringApplication.run(ProductApplicationMain.class,arr);


    }
}
