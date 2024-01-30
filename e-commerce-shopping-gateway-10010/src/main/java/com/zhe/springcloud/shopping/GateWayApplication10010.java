package com.zhe.springcloud.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

@SpringBootApplication
@EnableDiscoveryClient
public class GateWayApplication10010 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication10010.class, args);
    }
}
