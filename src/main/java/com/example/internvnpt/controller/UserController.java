package com.example.internvnpt.controller;

import com.example.internvnpt.dto.request.AuthRequest;
import com.example.internvnpt.entity.User;
import com.example.internvnpt.security.TokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenProvider tokenProvider;
    @GetMapping
    public String welcome(){
        return "welcome";
    }

    @PostMapping
    public String generateToken(@RequestBody User authRequest) throws  Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        } catch (Exception ex){
            throw new Exception("invalid username/password");
        }
        return tokenProvider.generateToken(authRequest);

    }
}
