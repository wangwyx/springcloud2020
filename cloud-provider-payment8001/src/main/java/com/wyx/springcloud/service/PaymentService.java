package com.wyx.springcloud.service;

import com.wyx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auth: wangyx-p
 * @date :2020-5-19 16:46
 * @Description:
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
