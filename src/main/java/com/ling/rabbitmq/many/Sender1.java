package com.ling.rabbitmq.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: 生产者
 * @author: linguande
 * @create: 2018-06-22 18:03
 **/
@Component
public class Sender1 {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(int i){
        String content = "queue  *** "+i;
        this.amqpTemplate.convertAndSend("many",content);
    }
}
