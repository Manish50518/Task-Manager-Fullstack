package com.example.taskmanager.controllers;


import com.example.taskmanager.dto.AuthDTO;
import com.example.taskmanager.dto.JwtToken;
import com.example.taskmanager.service.impl.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {


    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<JwtToken>    login(@RequestBody AuthDTO request) {
        return ResponseEntity.ok(authService.login(request));
    }
}