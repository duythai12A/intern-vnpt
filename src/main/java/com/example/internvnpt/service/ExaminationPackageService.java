package com.example.internvnpt.service;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.ExaminationPackageEntity;
import com.example.internvnpt.service.dto.BenefitDTO;
import com.example.internvnpt.service.dto.ExaminationPackageDTO;

public interface ExaminationPackageService {
    ExaminationPackageEntity create(ExaminationPackageDTO examinationPackageDTO);
    ExaminationPackageEntity update(ExaminationPackageDTO examinationPackageDTO);
    void delete(Long id);
}
