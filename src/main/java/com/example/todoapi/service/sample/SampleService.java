package com.example.todoapi.service.sample;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public SampleEntity find() {
        return new SampleEntity("Hello");
    }
}
