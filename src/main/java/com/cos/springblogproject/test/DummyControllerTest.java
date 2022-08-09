package com.cos.springblogproject.test;

import com.cos.springblogproject.model.User;
import com.cos.springblogproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {
    //Dependency Injection
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/dummy/join")
    public String join(User user){
        System.out.println(user.getUsername()
                + " " + user.getPassword()
                + " " + user.getEmail());

        userRepository.save(user);
        return "new member joined";
    }
}
