package com.example.internvnpt.service;

import com.example.internvnpt.entity.BenefitEntity;
import com.example.internvnpt.entity.ProcedureEntity;
import com.example.internvnpt.service.dto.BenefitDTO;
import com.example.internvnpt.service.dto.ProcedureDTO;

public interface ProcedureService {
    ProcedureEntity create(ProcedureDTO procedureDTO);
    ProcedureEntity update(ProcedureDTO procedureDTO);
    void delete(Long id);
}
