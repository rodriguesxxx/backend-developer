package br.danielrodrigues.todolist.controller;

import br.danielrodrigues.todolist.model.User;
import br.danielrodrigues.todolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    UserRepository userRepository;
    @GetMapping
    public String index(){
        return "Auth API Service";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return user.toString();
    }
}

