package com.huaying.hqwmall.order.mq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.jms.*;
import java.io.IOException;

public class ActivemqConsumerTest {

    public  static final String ACTIVEMQ_URL="tcp://192.168.174.12:61616";
    public  static final String QUEUE_NAME="queue01";
    public static void main(String[] args) throws JMSException, IOException {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        Connection connection =  connectionFactory.createConnection();
        connection.start();

        //创建会话SESSION
        //两个参数，第一个叫事务，第二个叫签收
        Session session =connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //创建目的地
        Queue queue = session.createQueue(QUEUE_NAME);
        //5  创建
        MessageConsumer messageConsumer = session.createConsumer(queue);
       /**
        * 同步阻塞方式receive()
        * 订阅者或接受者调用messageConsumer的receive()方法接受消息
       while (true){
           TextMessage message = (TextMessage) messageConsumer.receive(4000);
           System.out.println(3);
           if(message!=null){
               System.out.println("接受消息"+message.getText());
           }else {
               break;
           }
       }
        messageConsumer.close();
        session.close();
        connection.close(); */

       //通过监听的方式来获取消息
      messageConsumer.setMessageListener(new MessageListener(){
          @Override
          public void onMessage(Message message) {
              if(message!=null&&message instanceof TextMessage){
                  TextMessage textMessage = (TextMessage) message;
                  try {
                      System.out.println(textMessage.getText());
                  } catch (JMSException e) {
                      e.printStackTrace();
                  }
              }
          }
      });
      System.in.read();
      messageConsumer.close();
      session.close();
      connection.close();
    }
}
