package com.technxt.docker.demo;

import com.technxt.docker.demo.config.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.technxt.docker.demo.config")
public class SpringBootDockerDemoApplication {

    @Autowired
    SampleRepository sampleRepository;

    @GetMapping("/docker")
    public String dockerDemo() {

        sampleRepository.getAllSamples().forEach(a -> System.out.println(a.getId() + " , " + a.getName()));
        return "Spring Boot Docker Image";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerDemoApplication.class, args);
    }

}
