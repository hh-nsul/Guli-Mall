package com.atguigu.kipchogemall.membership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Remote Service Invocation:
 * 1. Introduce open-feign into pom.xml
 *
 * 2. Define an interface, making SpringCloud be aware of
 *    this interface needs to invoke remote service
 *
 * 3. Specify which service name & request will be associated with the method of the interface
 *
 * 4. Copy the method signature to the interface
 *
 * 5. Enable remote invocation
 *
 */
@EnableFeignClients(basePackages = "com.atguigu.kipchogemall.membership.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class KipchogemallMembershipApplication {

    public static void main(String[] args) {
        SpringApplication.run(KipchogemallMembershipApplication.class, args);
    }

}
