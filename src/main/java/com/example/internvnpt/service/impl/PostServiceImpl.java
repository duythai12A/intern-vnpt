package com.example.internvnpt.service.impl;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.PostEntity;
import com.example.internvnpt.repository.ExaminationPackageRepository;
import com.example.internvnpt.repository.PostRepository;
import com.example.internvnpt.service.PostService;
import com.example.internvnpt.service.dto.PostDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public PostEntity create(PostDTO postDTO) {
        PostEntity postEntity = objectMapper.convertValue(postDTO, PostEntity.class);
        postEntity.setCreatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
        postEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return postRepository.save(postEntity);
    }

    @Override
    public PostEntity update(PostDTO postDTO) {
        PostEntity postEntity = objectMapper.convertValue(postDTO, PostEntity.class);
        postEntity.setCreatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
        postEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return postRepository.save(postEntity);
    }

    @Override
    public void delete(Long id) {

    }
}
