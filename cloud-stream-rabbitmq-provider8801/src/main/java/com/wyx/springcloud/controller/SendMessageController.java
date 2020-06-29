package com.wyx.springcloud.controller;

import com.wyx.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auth: wangyx-p
 * @date :2020-6-27 17:01
 * @Description:
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

     @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
