package study.backend.firstspringsecurityproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.backend.firstspringsecurityproject.models.User;

@RestController
@RequestMapping("/first")
public class FirstController {
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping
    public String first(){
        return "Hello my First app with Spring Security";
    }
    
    @GetMapping("/secret")
    public String secretMessage(){   
        return "Fish Boll Cat";
    }

    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password){
        
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = 
            new UsernamePasswordAuthenticationToken(username, password);

        Authentication authenticate = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        
        var user = (User) authenticate.getPrincipal();
        
    }
}
