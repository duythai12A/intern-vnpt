package com.example.internvnpt.service.impl;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.repository.BenefitRepository;
import com.example.internvnpt.service.BenefitService;
import com.example.internvnpt.service.dto.BenefitDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class BenefitServiceImpl implements BenefitService {

    @Autowired
    private BenefitRepository benefitRepository;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public BenefitEntity create(BenefitDTO benefitDTO) {
        BenefitEntity benefitEntity = objectMapper.convertValue(benefitDTO, BenefitEntity.class);
        benefitEntity.setCreatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
        benefitEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return benefitRepository.save(benefitEntity);
    }

    @Override
    public BenefitEntity update(BenefitDTO benefitDTO) {
        BenefitEntity benefitEntity = objectMapper.convertValue(benefitDTO, BenefitEntity.class);
        benefitEntity.setUpdatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
        benefitEntity.setUpdateAt(new Timestamp(System.currentTimeMillis()));
        return benefitRepository.save(benefitEntity);
    }

    @Override
    public void delete(Long id) {
        benefitRepository.deleteById(id);
    }
}
