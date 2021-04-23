package com.huaying.hqwmall.coupon;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class CouponApplicationMain {

    public static void main(String[] arr){

        SpringApplication.run(CouponApplicationMain.class,arr);


    }
}
