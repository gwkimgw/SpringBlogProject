package com.cos.springblogproject.test;

import com.cos.springblogproject.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {
    @PostMapping("/dummy/join")
    public String join(User user){
        System.out.println(user.getUsername()
                + " " + user.getPassword()
                + " " + user.getEmail());
        return "new member joined";
    }
}
