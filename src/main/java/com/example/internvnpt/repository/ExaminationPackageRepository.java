package com.example.internvnpt.repository;

import com.example.internvnpt.entity.BenefitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminationPackageRepository extends JpaRepository<BenefitEntity, Long> {

}
