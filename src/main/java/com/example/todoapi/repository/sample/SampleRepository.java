package com.example.todoapi.repository.sample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleRepository {

    @Select("SELECT content FROM samples ORDER BY id LIMIT 1")
    SampleRecord select();

}
