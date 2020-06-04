package com.wyx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auth: wangyx-p
 * @date :2020-6-4 10:59
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain8000 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain8000.class, args);
    }
}

