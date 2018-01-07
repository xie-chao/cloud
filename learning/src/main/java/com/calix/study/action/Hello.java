package com.calix.study.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableE
@SpringBootApplication
public class Hello {

    String hello() {
        return "hehe!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Hello.class, args);
    }
}
