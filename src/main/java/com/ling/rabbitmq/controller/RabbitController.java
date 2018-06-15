package com.ling.rabbitmq.controller;

import com.ling.rabbitmq.service.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: linguande
 * @create: 2018-06-15 11:52
 **/
@Controller
public class RabbitController {

    @Autowired
    private HelloSender helloSender;

    @ResponseBody
    @RequestMapping(value="rabbit")
    public String rabbit(){
        helloSender.send();
        return "success";
    }
}
