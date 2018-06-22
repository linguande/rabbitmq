package com.ling.rabbitmq.rabbit;

import com.ling.rabbitmq.oneToMany.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: 一对多发送
 * @author: linguande
 * @create: 2018-06-22 17:53
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyTest {

    @Autowired
    private Sender sender;

    @Test
    public void oneToMany() throws Exception{
        for(int i=0;i<100;i++){
            sender.send(String.valueOf(i));
        }
    }
}
