package com.example.internvnpt.service;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.CommentEntity;
import com.example.internvnpt.service.dto.BenefitDTO;
import com.example.internvnpt.service.dto.CommentDTO;

public interface CommentService {
    CommentEntity create(CommentDTO commentDTO);
    CommentEntity update(CommentDTO commentDTO);
    void delete(Long id);
}
