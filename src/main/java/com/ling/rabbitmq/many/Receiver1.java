package com.ling.rabbitmq.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description: 接收端1
 * @author: linguande
 * @create: 2018-06-22 17:58
 **/
@Component
@RabbitListener(queues = "many")
public class Receiver1 {

    @RabbitHandler
    public void process(String i){
        System.out.println("Receiver 1 : "+i);
    }
}
