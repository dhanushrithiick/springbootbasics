package com.example.SpringbootBasics.Services;

import com.example.SpringbootBasics.Model.Task;
import com.example.SpringbootBasics.Model.Task.Status;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();
    private int currentId = 1;

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task createTask(String title, String description) {
        Task task = new Task(currentId++, title, description, Status.YET_TO_START);
        tasks.add(task);
        return task;
    }

    public Task updateTaskStatus(int id, String statusStr) {
        Status newStatus = parseStatus(statusStr);

        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setStatus(newStatus);
                return task;
            }
        }
        throw new RuntimeException("Task with ID " + id + " not found.");
    }

    private Status parseStatus(String statusStr) {
        try {
            return Status.valueOf(statusStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid status: " + statusStr);
        }
    }
}
