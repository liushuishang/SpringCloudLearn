package com.yay.microservice.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yuananyun
 * @date 2017/11/14 22:08
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHello(String name){
        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name="+name,String.class);
    }

}
