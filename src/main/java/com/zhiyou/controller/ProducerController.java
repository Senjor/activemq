/**
 * Copyright (C), 2009-2020, 智游集团
 * FileName: ProducerController
 * Author:   laosun
 * Date:     2020/1/13 1:06 下午
 * Description:
 */
package com.zhiyou.controller;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProducerController {

    @Autowired
    private JmsMessagingTemplate messagingTemplate;


    @RequestMapping("sendQueueMsg.action")
    public  void sendQueueMessage(String message) {

        System.out.println("123");

        ActiveMQQueue queue = new ActiveMQQueue("queueMsg01");

        this.messagingTemplate.convertAndSend(queue,message);



    }

    @RequestMapping("sendTopicMsg.action")
    public void sendTopicMessage(String message) {

        ActiveMQTopic topic = new ActiveMQTopic("topicMsg01");

        this.messagingTemplate.convertAndSend(topic,message);

    }
}
