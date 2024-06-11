package com.example.simple_board.reply;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

public interface ReplyRepository extends JpaRepository<ReplyEntity, Long> {
}
