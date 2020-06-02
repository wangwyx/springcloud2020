package com.wyx.springcloud.controller;

import com.wyx.springcloud.entities.CommonResult;
import com.wyx.springcloud.entities.Payment;
import com.wyx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @auth: wangyx-p
 * @date :2020-5-19 16:52
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result1 = paymentService.create(payment);
        log.info("sadfasdf"+"asdfadsf");
        if (result1 > 0) {
            return new CommonResult(200, "成功serverPort" + serverPort, payment);
        } else {
            return new CommonResult(400, "失败serverPort" + serverPort, payment);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);
        log.info("sadfasdf"+"asdfadsf"+"sadsfasdf");
        if(payment != null)
        {
            return new CommonResult(200, "查询成功,serverPort:  " + serverPort, payment);
        }else{
            return new CommonResult(444, "没有对应记录,查询ID: " + id + ",serverPort" + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }
}
