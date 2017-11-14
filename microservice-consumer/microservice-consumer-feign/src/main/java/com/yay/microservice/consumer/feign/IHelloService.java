package com.yay.microservice.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yuananyun
 * @date 2017/11/14 22:36
 **/
@FeignClient("service-hello")
public interface IHelloService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);
}
