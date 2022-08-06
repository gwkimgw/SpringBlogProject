package com.cos.springblogproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
    @GetMapping("/temp/home")
    public String tempHome() {
        System.out.println("temp home");
        //src/main/resources/static + ""
        return "/home.html";
    }

    @GetMapping("/temp/jsp")
    public String tempJsp() {
        System.out.println("jsp");
        return "test";
    }
}
