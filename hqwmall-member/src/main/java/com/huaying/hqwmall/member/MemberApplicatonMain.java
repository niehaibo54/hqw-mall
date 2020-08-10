package com.huaying.hqwmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

//@MapperScan("com.huaying.hqwmall.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.huaying.hqwmall.member.feign")
public class MemberApplicatonMain {

        public static void main(String[] arr){

            SpringApplication.run(MemberApplicatonMain.class,arr);


        }


}
