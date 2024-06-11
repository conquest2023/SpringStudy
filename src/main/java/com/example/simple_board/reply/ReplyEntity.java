package com.example.simple_board.reply;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name ="reply")
public class ReplyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  Long postId;

    private  String userName;

    private  String password;

    private  String status;

    private  String title;


    @Column(columnDefinition = "TEXT")
    private  String context;

    private LocalDateTime reply_at;

}