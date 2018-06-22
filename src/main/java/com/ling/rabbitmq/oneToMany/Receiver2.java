package com.ling.rabbitmq.oneToMany;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description: 接收端2
 * @author: linguande
 * @create: 2018-06-22 17:58
 **/
@Component
@RabbitListener(queues = "many")
public class Receiver2 {

    @RabbitHandler
    public void print(String i){
        System.out.println("Receiver 2 : "+i);
    }
}
