package com.yay.microservice.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "Error")
    public String sayHello(String name){
        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name="+name,String.class);
    }

    public String Error(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
