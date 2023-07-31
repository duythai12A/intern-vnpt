package com.example.internvnpt.service.impl;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.CommentEntity;
import com.example.internvnpt.repository.BenefitRepository;
import com.example.internvnpt.repository.CommentRepository;
import com.example.internvnpt.service.CommentService;
import com.example.internvnpt.service.dto.CommentDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public CommentEntity create(CommentDTO commentDTO) {
        CommentEntity commentEntity = objectMapper.convertValue(commentDTO, CommentEntity.class);
        commentEntity.setCreatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
        commentEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return commentRepository.save(commentEntity);
    }

    @Override
    public CommentEntity update(CommentDTO commentDTO) {
        CommentEntity commentEntity = objectMapper.convertValue(commentDTO, CommentEntity.class);
        commentEntity.setCreatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
        commentEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return commentRepository.save(commentEntity);
    }

    @Override
    public void delete(Long id) {
        commentRepository.deleteById(id);
    }
}
