package com.example.internvnpt.repository;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.ExaminationPackageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Repository
public interface BenefitRepository extends JpaRepository<BenefitEntity, Long> {

}
