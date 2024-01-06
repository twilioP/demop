package com.myblog.myblog1.payload;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PostDto {

    private long id;
    private String description;
    private String content;
    private String title;



}
