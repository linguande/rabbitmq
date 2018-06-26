package com.ling.rabbitmq.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: 发送者2
 * @author: linguande
 * @create: 2018-06-26 11:25
 **/
@Component
public class Sender2 {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(int i){
        String content = "sender2  *** "+i;
        this.amqpTemplate.convertAndSend("many",content);
    }
}
