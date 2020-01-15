/**
 * Copyright (C), 2009-2020, 智游集团
 * FileName: TopicConsumerController
 * Author:   laosun
 * Date:     2020/1/13 2:52 下午
 * Description:
 */
package com.zhiyou.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicConsumerController {

    @JmsListener(destination = "topicMsg01")
    public void receiveMsg1(String message){
        System.out.println("----111----- :" + message);


    }

    @JmsListener(destination = "topicMsg01")
    public void receiveMsg2(String message){
        System.out.println("----222----- :" + message);
    }
}
