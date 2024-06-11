package com.example.simple_board.post.db;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name = "post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  Long boardId;

    private  String userName;

    private  String password;

    private  String email;

    private  String title;

    private  String status;

    @Column(columnDefinition = "TEXT")
    private String context;

    private LocalDateTime postedAt;

}
