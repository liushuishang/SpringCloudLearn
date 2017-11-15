package com.yay.microservice.consumer.feign.impl;

import com.yay.microservice.consumer.feign.IHelloService;
import org.springframework.stereotype.Component;

/**
 * @author yuananyun
 * @date 2017/11/15 15:43
 **/
@Component
public class HelloServiceHystric implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "sorry" + name;
    }
}
