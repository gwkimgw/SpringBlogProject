package com.cos.springblogproject.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {
    @GetMapping("/hello")
    public String hello(){
        return "<h1>hello spring boot</h1>";
    }
}