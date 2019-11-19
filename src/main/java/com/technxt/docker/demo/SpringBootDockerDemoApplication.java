package com.technxt.docker.demo;

import com.technxt.docker.demo.config.Sample;
import com.technxt.docker.demo.config.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/docker")
@RestController
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.technxt.docker.demo.config")
public class SpringBootDockerDemoApplication {

    @Autowired
    SampleRepository sampleRepository;

    @GetMapping
    public String dockerDemo() {

        sampleRepository.getAllSamples().forEach(a -> System.out.println(a.getId() + " , " + a.getName()));
        return "Spring Boot Docker Image";
    }
    @PostMapping
    public void save(@RequestBody Sample sampleDto) {

sampleRepository.save(sampleDto);
System.out.println("saving");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerDemoApplication.class, args);
    }

}
