package com.huaying.hqwmall.order;

import com.huaying.hqwmall.order.entity.OrderEntity;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws Exception{
      OrderEntity a = new OrderEntity();

      //反射11111
      Class o  = Class.forName("com.huaying.hqwmall.order.entity.OrderEntity");
      OrderEntity b = (OrderEntity) o.newInstance();
      System.out.println(b.getReceiverCity());


    }
}
