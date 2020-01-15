/**
 * Copyright (C), 2009-2020, 智游集团
 * FileName: QueueConsumerController
 * Author:   laosun
 * Date:     2020/1/13 1:11 下午
 * Description:
 */
package com.zhiyou.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueueConsumerController {

    @JmsListener(destination = "queueMsg01")
    public void readQueueMsg(String message) {

        System.out.println("。。。。。。");
        System.out.println("receive massage:" + message);

    }
}
