package com.calix.cloud.eurekaclient.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by calix on 18-1-11.
 * test
 */

@RestController
public class Hello {

    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/")
    public List<ServiceInstance> index() {
        return serviceInstances();
    }

    @RequestMapping("/info")
    public List<ServiceInstance> serviceInstances() {
        return this.discoveryClient.getInstances("hello-service");
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name", defaultValue = "everyone") String name) {
        logger.info("/hello, params:name" + name);
        return "hello " + name;
    }
}
