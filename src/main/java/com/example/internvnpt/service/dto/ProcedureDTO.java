package com.example.internvnpt.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProcedureDTO {
    private Long id;
    private Long step;
    private String action;
    private Long examinationPackageId;
}
