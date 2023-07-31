package com.example.internvnpt.service.impl;

import com.example.internvnpt.repository.PostRepository;
import com.example.internvnpt.repository.UserRepository;
import com.example.internvnpt.service.ProcedureService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ObjectMapper objectMapper;
}
