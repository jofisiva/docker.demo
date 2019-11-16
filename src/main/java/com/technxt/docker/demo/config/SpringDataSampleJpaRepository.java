package com.technxt.docker.demo.config;

import com.technxt.docker.demo.config.Sample;
import org.springframework.data.repository.CrudRepository;

public interface SpringDataSampleJpaRepository extends CrudRepository<Sample,Integer> {
}
