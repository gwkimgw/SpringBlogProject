package com.cos.springblogproject.repository;

import com.cos.springblogproject.model.Board;
import com.cos.springblogproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}
