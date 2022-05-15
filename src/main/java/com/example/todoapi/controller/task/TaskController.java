package com.example.todoapi.controller.task;

import com.example.todoapi.controller.TasksApi;
import com.example.todoapi.model.TaskDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController implements TasksApi {

    @Override
    public ResponseEntity<TaskDTO> showTask() {
        var body = new TaskDTO();
        body.setId(1L);
        body.setTitle("TEST");
        return ResponseEntity.ok(body);
    }
}
