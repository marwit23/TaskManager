package com.marwit23.TaskManager.task;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> findAll() {
        return taskService.findAll();
    }

    @GetMapping("/{taskId}")
    public Task findById(@PathVariable Long taskId) {
        return taskService.findById(taskId);
    }

    @PostMapping
    public Task newTask(@RequestBody Task theTask) {
        taskService.save(theTask);
        return theTask;
    }

    @PutMapping
    public Task updateTask(@PathVariable Long taskId, @RequestBody Task theTask) {
        theTask.setTaskId(taskId);
        taskService.save(theTask);
        return theTask;
    }

    @DeleteMapping("/{taskId}")
    public String deleteTask(@PathVariable Long taskId) {
        taskService.deleteById(taskId);
        return "Deleted task id - " + taskId;
    }
}
