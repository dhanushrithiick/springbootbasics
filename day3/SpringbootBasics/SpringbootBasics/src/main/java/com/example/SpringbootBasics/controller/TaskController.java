package com.example.SpringbootBasics.controller;

import com.example.SpringbootBasics.Model.Task;
import com.example.SpringbootBasics.Services.TaskService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Map<String, String> payload) {
        String title = payload.get("title");
        String description = payload.get("description");
        return service.createTask(title, description);
    }

    @PutMapping("/{id}/status")
    public Task updateStatus(@PathVariable int id, @RequestBody Map<String, String> payload) {
        String status = payload.get("status");
        return service.updateTaskStatus(id, status);
    }
}
