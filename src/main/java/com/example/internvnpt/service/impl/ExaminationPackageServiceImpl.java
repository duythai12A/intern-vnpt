package com.example.internvnpt.service.impl;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.ExaminationPackageEntity;
import com.example.internvnpt.repository.BenefitRepository;
import com.example.internvnpt.repository.ExaminationPackageRepository;
import com.example.internvnpt.service.ExaminationPackageService;
import com.example.internvnpt.service.dto.ExaminationPackageDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class ExaminationPackageServiceImpl implements ExaminationPackageService {
    @Autowired
    private ExaminationPackageRepository examinationPackageRepository;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public ExaminationPackageEntity create(ExaminationPackageDTO examinationPackageDTO) {
        ExaminationPackageEntity examinationPackageEntity = objectMapper.convertValue(examinationPackageDTO, ExaminationPackageEntity.class);
        examinationPackageEntity.setCreatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
        examinationPackageEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return examinationPackageRepository.save(examinationPackageEntity);
    }

    @Override
    public ExaminationPackageEntity update(ExaminationPackageDTO examinationPackageDTO) {
        ExaminationPackageEntity examinationPackageEntity = objectMapper.convertValue(examinationPackageDTO, ExaminationPackageEntity.class);
        examinationPackageEntity.setCreatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
        examinationPackageEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return examinationPackageRepository.save(examinationPackageEntity);
    }

    @Override
    public void delete(Long id) {

    }
}
