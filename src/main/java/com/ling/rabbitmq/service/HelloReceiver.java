package com.ling.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description: 接收者
 * @author: linguande
 * @create: 2018-06-12 17:59
 **/
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

   @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver : "+hello);
    }
}
