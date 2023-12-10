package api.example.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    
    @GetMapping
    public ResponseEntity<String> index(){
        return new ResponseEntity<>("Hello World baby", HttpStatus.ACCEPTED);
    }
}
