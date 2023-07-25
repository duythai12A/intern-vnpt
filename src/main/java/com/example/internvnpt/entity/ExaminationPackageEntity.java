package com.example.internvnpt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.stream.events.Comment;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "examination_package")
public class ExaminationPackageEntity extends BaseEntity{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "cost")
    private Float cost;
    @Column(name = "address")
    private String address;
    @Column(name = "define")
    private String define;//định nghĩa

    @OneToMany(mappedBy = "postEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommentEntity> comments;
    @OneToMany(mappedBy = "examinationPackageEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProcedureEntity> procedureEntities;
    @OneToMany(mappedBy = "examinationPackageEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BenefitEntity> benefitEntities;
}
