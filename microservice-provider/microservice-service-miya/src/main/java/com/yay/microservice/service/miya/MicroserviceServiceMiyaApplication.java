package com.yay.microservice.service.miya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class MicroserviceServiceMiyaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceServiceMiyaApplication.class, args);
    }


    private static final Logger LOG = Logger.getLogger(MicroserviceServiceMiyaApplication.class.getName());


    @RequestMapping("/hi")
    public String home(){
        LOG.log(Level.INFO, "hi is being called");
        return "hi i'm miya!"+System.currentTimeMillis();
    }

    @RequestMapping("/miya")
    public String info(){
        LOG.log(Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
