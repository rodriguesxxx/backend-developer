package br.danielrodrigues.todolist.controller;

import br.danielrodrigues.todolist.model.Task;
import br.danielrodrigues.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/")
    public ResponseEntity<?> index() {
        return new ResponseEntity<>(taskService.getAllTasks(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/")
    public ResponseEntity<?> store(@RequestBody Task task) {
        try {
            taskService.addTask(task);
            return new ResponseEntity<>("Sucesso ao criar tarefa", HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>("Erro ao criar tarefa", HttpStatus.BAD_REQUEST);
        }
    }

}
