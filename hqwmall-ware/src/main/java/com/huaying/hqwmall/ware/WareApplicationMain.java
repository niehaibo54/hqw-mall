package com.huaying.hqwmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class WareApplicationMain {

    public static void main(String[] arr){

        SpringApplication.run(WareApplicationMain.class,arr);


    }
}
