package com.example.ToDouDou.service;

import com.example.ToDouDou.entity.Task;
import com.example.ToDouDou.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;

    public void saveorUpdate(Task tasks) {
        taskRepo.save(tasks);

    }
    public Iterable<Task> ListAll() {
        return this.taskRepo.findAll();
    }

    public void deleteTask(String id) {
        taskRepo.deleteById(id);
    }

    public Task getTaskById(String id) {
        return taskRepo.findById(id).get();
    }
}
