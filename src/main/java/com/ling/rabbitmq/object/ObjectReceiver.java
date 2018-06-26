package com.ling.rabbitmq.object;

import com.ling.rabbitmq.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description: 接收者-对象
 * @author: linguande
 * @create: 2018-06-26 11:45
 **/
@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {

    @RabbitHandler
    public void process(User user){
        System.out.println("ObjectReceiver : "+user);
    }
}
