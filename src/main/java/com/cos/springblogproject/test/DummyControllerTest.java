package com.cos.springblogproject.test;

import com.cos.springblogproject.model.RoleType;
import com.cos.springblogproject.model.User;
import com.cos.springblogproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Supplier;

@RestController
public class DummyControllerTest {
    //Dependency Injection
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable int id){
        User user = userRepository.findById(id).orElseThrow(
                new Supplier<IllegalArgumentException>() {
            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException("no such user");
            }
        });
        return user;
    }

    @PostMapping("/dummy/join")
    public String join(User user){
        System.out.println(user.getUsername()
                + " " + user.getPassword()
                + " " + user.getEmail());

        user.setRole(RoleType.USER);

        userRepository.save(user);
        return "new member joined";
    }
}
