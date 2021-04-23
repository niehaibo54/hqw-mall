package com.huaying.hqwmall.coupon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.TextMessage;

@Component
public class Queue_Produce
{
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void produceMsg(){
        jmsMessagingTemplate.convertAndSend(queue,"*********hello word");
    }

//    @Scheduled(fixedDelay = 1000)
//    public void produceMsgDingshi(){
//        System.out.println("hello word");
//        jmsMessagingTemplate.convertAndSend(queue,"*********hello word");
//    }








}
