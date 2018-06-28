package com.ling.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @description:
 * @author: linguande
 * @create: 2018-06-26 17:20
 **/
@Configuration
public class TopicRabbitConfig {
    private static String message = "topic.message";
    private static String messages = "topic.message";

    @Bean
    public Queue queueManage(){
        return new Queue(TopicRabbitConfig.message);
    }

    @Bean
    public Queue queueManages(){
        return new Queue(TopicRabbitConfig.messages);
    }

    @Bean
    TopicExchange exchange(){
        return new TopicExchange("exchange");
    }

    @Bean
    Binding bindingExchangeMessage(Queue queueMessage,TopicExchange exchange){
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueMessages,TopicExchange exchange){
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
}
