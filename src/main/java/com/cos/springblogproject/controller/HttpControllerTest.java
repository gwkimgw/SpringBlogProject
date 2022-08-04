package com.cos.springblogproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {
    @GetMapping("/http/get")
    //@RequestParam int id, @RequestParam String username
    public String getTest(Member member){
        return "get : " + member.getId() + "," + member.getUsername();
    }

    @PostMapping("/http/post")
    public String postTest(@RequestBody Member member){
        return "post: " + member.getId() + "," + member.getUsername() + "," + member.getPassword();
    }

    @PutMapping("http/put")
    public String putTest(){
        return "put";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete";
    }
}