package com.marwit23.TaskManager.task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();
    Task findById(Long taskId);
    void save(Task theTask);
    void deleteById(Long taskId);
}
