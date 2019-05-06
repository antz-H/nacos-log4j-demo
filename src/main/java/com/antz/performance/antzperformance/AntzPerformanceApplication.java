package com.antz.performance.antzperformance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication()
public class AntzPerformanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntzPerformanceApplication.class, args);
    }

}
