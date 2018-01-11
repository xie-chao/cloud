package com.calix.cloud.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by calix on 18-1-11.
 * hello service
 */

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientBootStrap {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientBootStrap.class, args);
    }

//    @RestController
//    class ServiceInstanceRestController {
//
//        @Autowired
//        private DiscoveryClient discoveryClient;
//
//        @RequestMapping("/{applicationName}")
//        public List<ServiceInstance> serviceInstancesByApplicationName(
//                @PathVariable String applicationName) {
//            return this.discoveryClient.getInstances(applicationName);
//        }
//    }
}
