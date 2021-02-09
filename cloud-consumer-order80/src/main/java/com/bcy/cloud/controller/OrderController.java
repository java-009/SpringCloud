package com.bcy.cloud.controller;

import com.bcy.bean.CommonResult;
import com.bcy.bean.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    //public static final String URL="http://localhost:8081";
    public static final String URL="http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/getPayment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(URL+"/payment/getPayment/"+id, CommonResult.class);
    }

    @GetMapping("/consumer/payment/createPayment")
    public CommonResult<Payment> createPayment(Payment payment){
        return restTemplate.postForObject(URL+"/payment/createPayment",payment,CommonResult.class);
    }

}
