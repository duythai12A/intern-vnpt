package com.example.internvnpt.repository;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
