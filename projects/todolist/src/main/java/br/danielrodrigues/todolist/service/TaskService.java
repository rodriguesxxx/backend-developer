package br.danielrodrigues.todolist.service;

import br.danielrodrigues.todolist.model.Task;
import br.danielrodrigues.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void addTask(Task task){
        taskRepository.save(task);
    }
}
