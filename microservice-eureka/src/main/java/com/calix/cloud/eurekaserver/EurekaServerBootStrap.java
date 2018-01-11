package com.calix.cloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by calix on 18-1-11.
 * 服务注册中心
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerBootStrap {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerBootStrap.class, args);
    }
}
