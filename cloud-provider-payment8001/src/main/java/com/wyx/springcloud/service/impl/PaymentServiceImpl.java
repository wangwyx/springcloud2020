package com.wyx.springcloud.service.impl;

import com.wyx.springcloud.dao.PaymentDao;
import com.wyx.springcloud.entities.Payment;
import com.wyx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auth: wangyx-p
 * @date :2020-5-19 16:42
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
