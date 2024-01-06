package com.myblog.myblog1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Table(name="post")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String content;
    private String title;





}
