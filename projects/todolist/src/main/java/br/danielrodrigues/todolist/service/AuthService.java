package br.danielrodrigues.todolist.service;

import br.danielrodrigues.todolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String login(){
        return "token: ";
    }

}
