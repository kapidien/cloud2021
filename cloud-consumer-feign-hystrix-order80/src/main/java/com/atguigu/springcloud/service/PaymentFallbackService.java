package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2021-10-06 9:59
 */
@Component
public class PaymentFallbackService implements PaymentHytrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}
