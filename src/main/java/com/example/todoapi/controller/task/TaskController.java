package com.example.todoapi.controller.task;

import com.example.todoapi.controller.TasksApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController implements TasksApi {

    @Override
    public ResponseEntity<Void> showTask() {
        return ResponseEntity.ok().build();
    }
}
