package com.example.internvnpt.service.dto;

import com.example.internvnpt.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommentDTO {
    private Long id;
    private String content;
    private User user;
    private Long examinationPackageId;
    private Long postId;
}
