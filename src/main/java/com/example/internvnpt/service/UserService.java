package com.example.internvnpt.service;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.User;
import com.example.internvnpt.service.dto.BenefitDTO;
import com.example.internvnpt.service.dto.UserDTO;

public interface UserService {
    User create(UserDTO userDTO);
    User update(UserDTO userDTO);
    void delete(Long id);
}
