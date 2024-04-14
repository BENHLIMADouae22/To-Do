package com.example.ToDouDou.controller;

import com.example.ToDouDou.entity.Task;
import com.example.ToDouDou.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/save")
    public String saveTask(@RequestBody Task tasks){
        taskService.saveorUpdate(tasks);

        return tasks.get_id();
    }

    @GetMapping("/getAll")
    public Iterable<Task>getTasks() {
        Iterable<Task> tasks = taskService.ListAll();
        System.out.println(tasks);
        return tasks;
    }

    @PutMapping("/edit/{id}")
    public Task updateTask(@RequestBody Task task,@PathVariable("id") String _id) {
        task.set_id(_id);
        taskService.saveorUpdate(task);
        return task;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable("id") String _id) {
        taskService.deleteTask(_id);
    }

    @RequestMapping("/search/{id}")
    public Task getTask(@PathVariable("id") String _id){
        return taskService.getTaskById(_id);
    }
}
