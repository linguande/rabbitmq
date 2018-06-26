package com.ling.rabbitmq.object;

import com.ling.rabbitmq.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: 发送者-对象
 * @author: linguande
 * @create: 2018-06-26 11:45
 **/
@Component
public class ObjectSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(User user){
        System.out.println("ObjectSender : "+user);
        this.amqpTemplate.convertAndSend("object",user);
    }
}
