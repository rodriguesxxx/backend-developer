package api.example.app.controllers;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.example.app.models.User;
import api.example.app.services.CookieService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {
   
    private User admin = new User("admin", "admin");

    @GetMapping
    public String index(HttpServletRequest request){
        return CookieService.getCookie(request, "userid");
    }

    @PostMapping("/login")
    public ResponseEntity<Map> login(@RequestBody User user, HttpServletResponse response){
        if( admin.equals(user) ){
            CookieService.setCookie(response, "userid", user.getId().toString());
            return new ResponseEntity<>(
                Collections.singletonMap(user.getUsername(), user.getPassword()),
                HttpStatus.ACCEPTED
            );
        }

        return new ResponseEntity<>(
            Collections.singletonMap("error", "invalid username or password"),
            HttpStatus.UNAUTHORIZED
        );
    
    }
}
