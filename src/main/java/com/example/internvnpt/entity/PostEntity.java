package com.example.internvnpt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.stream.events.Comment;
import java.sql.Timestamp;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "post")
public class PostEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title",nullable = false,length = 300)
    private String title;
    @Column(name = "content",columnDefinition = "TEXT")
    private String content;
    @Column(name = "description",columnDefinition = "TEXT")
    private String description;
    @Column(name = "slug",nullable = false,length = 600)
    private String slug;
    @Column(name = "thumbnail")
    private String thumbnail;
    @Column(name = "published_at")
    private Timestamp publishedAt;
    @Column(name = "status",columnDefinition = "int default 0")
    private int status;
    @OneToMany(mappedBy = "postEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommentEntity> comments;

}