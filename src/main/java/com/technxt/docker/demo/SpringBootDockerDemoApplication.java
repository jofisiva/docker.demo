package com.technxt.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDockerDemoApplication {

    @GetMapping("/docker")
    public String dockerDemo() {

        return "Spring Boot Docker Image";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerDemoApplication.class, args);
    }

}
