package com.huaying.hqwmall.order;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class TestRedis {

    public static void main(String[] args) {


        Jedis jedis = new Jedis("192.168.174.12",6381);
         jedis.select(0);

        Set<String> keys =  jedis.keys("*");
        System.out.println(keys.size());
        for(String s:keys){
            System.out.println(s);
        }

    }
}
