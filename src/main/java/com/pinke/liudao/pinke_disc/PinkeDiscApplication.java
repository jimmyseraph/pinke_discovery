package com.pinke.liudao.pinke_disc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PinkeDiscApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinkeDiscApplication.class, args);
    }
}
