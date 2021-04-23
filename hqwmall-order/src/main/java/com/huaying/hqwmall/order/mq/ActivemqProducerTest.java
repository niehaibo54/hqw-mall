package com.huaying.hqwmall.order.mq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.commons.lang.StringUtils;

import javax.jms.*;

public class ActivemqProducerTest {

    public  static final String ACTIVEMQ_URL="tcp://192.168.174.12:61616";
    public  static final String QUEUE_NAME="queue01";
    public static void main(String[] args) throws JMSException {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
       Connection connection =  connectionFactory.createConnection();
       connection.start();

       //创建会话SESSION
        //两个参数，第一个叫事务，第二个叫签收
       Session session =connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
       //创建目的地
       Queue queue = session.createQueue(QUEUE_NAME);
       //5  创建
        MessageProducer producer = session.createProducer(queue);

        for(int i=1;i<=3;i++){
            TextMessage  textMessage  = session.createTextMessage("aaaaamsg"+i);
            session.createMapMessage();
           //  DeliveryMode.NON_PERSISTENT; 非持久
            //消息持久化
           // producer.setDeliveryMode(DeliveryMode.PERSISTENT);
            producer.send(textMessage);

        }

        producer.close();
        session.close();
        connection.close();
        System.out.println("OK");



    }
}
