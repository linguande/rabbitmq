package com.ling.rabbitmq.rabbit;

import com.ling.rabbitmq.many.Sender1;
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
public class ManyTest {

    @Autowired
    private Sender1 sender1;

    @Test
    public void Many() throws Exception {
        for (int i = 0; i < 50; i++) {
            sender1.send(i);
        }
    }
}
