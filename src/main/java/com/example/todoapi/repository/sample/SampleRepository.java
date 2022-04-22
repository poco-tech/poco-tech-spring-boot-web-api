package com.example.todoapi.repository.sample;

import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {

    public SampleRecord select() {
        return new SampleRecord("Hello, world!!");
    }

}
