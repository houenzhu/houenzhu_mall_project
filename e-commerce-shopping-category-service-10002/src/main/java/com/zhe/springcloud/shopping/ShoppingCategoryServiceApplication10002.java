package com.zhe.springcloud.shopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages = {"com.zhe.springcloud.shopping.mapper"})
public class ShoppingCategoryServiceApplication10002 {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingCategoryServiceApplication10002.class, args);
    }
}
