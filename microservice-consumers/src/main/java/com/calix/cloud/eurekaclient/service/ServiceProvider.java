package com.calix.cloud.eurekaclient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceProvider {

    private static final Logger logger = LoggerFactory.getLogger(ServiceProvider.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hello-service/{method}/{name}")
    public String helloConsumer(@PathVariable("method") final String method, @PathVariable("name") String name) {
        logger.info("method:" + method + "/" + name);
        return restTemplate.getForEntity("http://HELLO-SERVICE/{method}/{name}", String.class, method, name).getBody();
    }
}
