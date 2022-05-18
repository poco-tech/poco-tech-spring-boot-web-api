package com.example.todoapi.service.task;

import com.example.todoapi.repository.task.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskEntity find() {
        return taskRepository.select()
                .map(record -> new TaskEntity(record.getId(), record.getTitle()))
                .orElseThrow(() -> new IllegalStateException("TODO")); // TODO
    }
}
