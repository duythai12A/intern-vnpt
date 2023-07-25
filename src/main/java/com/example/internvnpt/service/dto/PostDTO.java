package com.example.internvnpt.service.dto;

import com.example.internvnpt.entity.CommentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostDTO {
    private long id;
    private String title;
    private String content;
    private String description;
    private String slug;
    private String thumbnail;
    private Timestamp publishedAt;
    private int status;
    private List<CommentEntity> comments;
}
