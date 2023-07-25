package com.example.internvnpt.repository;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
}
