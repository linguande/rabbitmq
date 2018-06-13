package com.ling.rabbitmq.rabbit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: linguande
 * @create: 2018-06-12 18:15
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {

    //@Autowired
    //private HelloSender helloSender;

    @Test
    public void hello() throws Exception{
        //helloSender.send();
        System.out.println("111");
    }
}
