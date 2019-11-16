package com.technxt.docker.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository   {

    private SpringDataSampleJpaRepository springDataSampleJpaRepository;

    @Autowired
    public SampleRepository(SpringDataSampleJpaRepository springDataSampleJpaRepository) {
        this.springDataSampleJpaRepository = springDataSampleJpaRepository;
    }

    public List<Sample> getAllSamples() {

        return (List<Sample>) springDataSampleJpaRepository.findAll();
    }

}
