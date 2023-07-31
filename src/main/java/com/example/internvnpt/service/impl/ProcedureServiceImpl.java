package com.example.internvnpt.service.impl;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.ProcedureEntity;
import com.example.internvnpt.repository.PostRepository;
import com.example.internvnpt.repository.ProcedureRepository;
import com.example.internvnpt.service.ProcedureService;
import com.example.internvnpt.service.dto.ProcedureDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class ProcedureServiceImpl implements ProcedureService {
    @Autowired
    private ProcedureRepository procedureRepository;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public ProcedureEntity create(ProcedureDTO procedureDTO) {
        ProcedureEntity procedureEntity = objectMapper.convertValue(procedureDTO, ProcedureEntity.class);
        procedureEntity.setCreatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
        procedureEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return procedureRepository.save(procedureEntity);
    }

    @Override
    public ProcedureEntity update(ProcedureDTO procedureDTO) {
        ProcedureEntity procedureEntity = objectMapper.convertValue(procedureDTO, ProcedureEntity.class);
        procedureEntity.setCreatedBy(SecurityContextHolder.getContext().getAuthentication().getName());
        procedureEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return procedureRepository.save(procedureEntity);
    }

    @Override
    public void delete(Long id) {

    }
}
