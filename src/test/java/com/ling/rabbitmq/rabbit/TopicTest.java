package com.ling.rabbitmq.rabbit;

import com.ling.rabbitmq.topic.TopicSender1;
import com.ling.rabbitmq.topic.TopicSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: linguande
 * @create: 2018-07-21 14:34
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest {

    @Autowired
    private TopicSender1 topicSender1;

    @Autowired
    private TopicSender2 topicSender2;

    @Test
    public void topic1(){
        topicSender1.send();
    }

    @Test
    public void topic2(){
        topicSender2.send();
    }
}
