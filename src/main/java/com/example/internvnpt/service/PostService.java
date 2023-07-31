package com.example.internvnpt.service;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.PostEntity;
import com.example.internvnpt.service.dto.BenefitDTO;
import com.example.internvnpt.service.dto.PostDTO;

public interface PostService {
    PostEntity create(PostDTO postDTO);
    PostEntity update(PostDTO postDTO);
    void delete(Long id);
}
