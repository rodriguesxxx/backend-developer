package com.study.backend.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.study.backend.restapi.models.Task;
import com.study.backend.restapi.services.TaskService;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public ResponseEntity<?> showTasks(){
        try{
            List<Task> tasks = taskService.getAllTasks();
            return new ResponseEntity< List<Task> >(tasks, HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<String> createTask(@RequestBody Task newTask){
        try{
            taskService.create(newTask);
            return new ResponseEntity<String>("Sucess creating task", HttpStatus.CREATED);
        } catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/complete")
    public ResponseEntity<?> completeTask(@RequestParam("id") Integer taskID){
        try{
            taskService.completedTask(taskID);
            return new ResponseEntity<String>( "This task has been completed", HttpStatus.CREATED );
        } catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteTask( @RequestParam("id") Integer taskID ){
        try{
            taskService.deleteTask(taskID);
            return new ResponseEntity<String>("This task has been deleted", HttpStatus.ACCEPTED);
        } catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

     @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return new ResponseEntity<String>("pong", HttpStatus.ACCEPTED);
    }

}
