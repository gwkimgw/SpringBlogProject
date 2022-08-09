package com.cos.springblogproject.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {
    private static final String TAG = "HttpControllerTest:";

    @GetMapping("/http/lombok")
    public String lombokTest() {
        Member member1 = Member.builder().username("user").password("2134").email("eamlk").build();
        System.out.println(TAG + "getter: " + member1.getId());
        member1.setId(500);
        System.out.println(TAG + "setter: " + member1.getId());
        return "lombok test";
    }

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