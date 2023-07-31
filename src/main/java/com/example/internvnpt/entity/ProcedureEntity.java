package com.example.internvnpt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "[procedure]")
public class ProcedureEntity extends BaseEntity{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "step")
    private Long step;
    @Column(name = "[action]")
    private String action;
    @ManyToOne
    @JoinColumn(name = "examination_package_id")
    private ExaminationPackageEntity examinationPackageEntity;
}
