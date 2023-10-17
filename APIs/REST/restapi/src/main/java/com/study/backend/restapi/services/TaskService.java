package com.study.backend.restapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.backend.restapi.models.Task;
import com.study.backend.restapi.repository.TaskRepository;

@Service
public class TaskService {
    
    @Autowired
    TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public void create(Task task){
        taskRepository.save(task);
    }

}
