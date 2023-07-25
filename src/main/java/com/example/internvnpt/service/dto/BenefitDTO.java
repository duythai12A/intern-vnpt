package com.example.internvnpt.service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BenefitDTO {
    private Long id;
    private String name;
    private String description;
    private Long examinationPackageId;
}
