package com.example.internvnpt.service;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.service.dto.BenefitDTO;

public interface BenefitService {
    BenefitEntity create(BenefitDTO benefitDTO);
    BenefitEntity update(BenefitDTO benefitDTO);
    void delete(Long id);
}
