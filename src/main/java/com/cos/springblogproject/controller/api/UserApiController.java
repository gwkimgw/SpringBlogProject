package com.cos.springblogproject.controller.api;

import com.cos.springblogproject.dto.ResponseDto;
import com.cos.springblogproject.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {
    @PostMapping("/api/user")
    public ResponseDto<Integer> save(@RequestBody User user) {
        System.out.println("userapicontroller");
        return new ResponseDto<Integer>(HttpStatus.OK, 1);
    }
}