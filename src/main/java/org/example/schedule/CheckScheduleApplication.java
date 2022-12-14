package org.example.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author JQ
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CheckScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheckScheduleApplication.class, args);
    }
}
