package com.huaying.hqwmall.coupon.test;


import com.huaying.hqwmall.coupon.CouponApplicationMain;
import com.huaying.hqwmall.coupon.Queue_Produce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes =CouponApplicationMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestMQ {
    @Resource
     private Queue_Produce queue_produce;

    @Test
     public void testSend(){
        queue_produce.produceMsg();

     }

     @Test
     public void receive(){
        // queue_produce.receive();
     }

}
