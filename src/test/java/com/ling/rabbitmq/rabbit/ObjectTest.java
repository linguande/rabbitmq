package com.ling.rabbitmq.rabbit;

import com.ling.rabbitmq.entity.User;
import com.ling.rabbitmq.object.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: 发送对象测试
 * @author: linguande
 * @create: 2018-06-26 11:53
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectTest {

    @Autowired
    private ObjectSender objectSender;

    @Test
    public void objectTest() {
        User user = new User("test", "123456");
        objectSender.send(user);
    }
}
