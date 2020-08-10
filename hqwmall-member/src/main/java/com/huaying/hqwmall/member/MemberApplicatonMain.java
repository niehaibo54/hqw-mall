package com.huaying.hqwmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.huaying.hqwmall.member.dao")
@SpringBootApplication
public class MemberApplicatonMain {

        public static void main(String[] arr){

            SpringApplication.run(MemberApplicatonMain.class,arr);


        }


}
