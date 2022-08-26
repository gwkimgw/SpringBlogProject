package com.cos.springblogproject.repository;

import com.cos.springblogproject.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository <Reply, Integer> {
}
