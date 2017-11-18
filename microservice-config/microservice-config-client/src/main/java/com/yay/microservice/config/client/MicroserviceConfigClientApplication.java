package com.yay.microservice.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanExpressionContext;
import org.springframework.beans.factory.config.BeanExpressionResolver;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.expression.StandardBeanExpressionResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class MicroserviceConfigClientApplication {


    @Autowired
    private ConfigurableBeanFactory  factory;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfigClientApplication.class, args);
    }

//    @Value("${foo}")
//    String foo;

    @RequestMapping(value = "/hi")
    public String hi() {
        BeanExpressionResolver resolver = new StandardBeanExpressionResolver();
        String resolvedValue = factory.resolveEmbeddedValue("${foo}");
        return String.valueOf( resolver.evaluate(resolvedValue, new BeanExpressionContext(factory, null)));
    }
}
