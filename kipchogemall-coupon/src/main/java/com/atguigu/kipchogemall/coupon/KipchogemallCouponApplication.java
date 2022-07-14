package com.atguigu.kipchogemall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KipchogemallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(KipchogemallCouponApplication.class, args);
    }

}
