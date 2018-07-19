package com.ling.rabbitmq.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: linguande
 * @create: 2018-07-19 17:58
 **/
@Component
public class TopicSender1 {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hi , i am message1";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("exchange", "topic.message", context);
    }
}
