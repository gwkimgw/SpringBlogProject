package com.cos.springblogproject.repository;

import com.cos.springblogproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    User findByUsernameAndPassword(String username, String password);
}
