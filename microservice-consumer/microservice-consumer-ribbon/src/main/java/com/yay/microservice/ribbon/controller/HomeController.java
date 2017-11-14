package com.yay.microservice.ribbon.controller;

import com.yay.microservice.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuananyun
 * @date 2017/11/14 22:12
 **/
@RestController
public class HomeController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
