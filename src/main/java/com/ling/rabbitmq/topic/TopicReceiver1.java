package com.ling.rabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: linguande
 * @create: 2018-07-21 14:24
 **/
@Component
@RabbitListener(queues = "topic.message")
public class TopicReceiver1 {

    @RabbitHandler
    public void receiver(String message){
        System.out.println("Topic Receiver1 : "+message);
    }
}
