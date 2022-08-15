package com.cos.springblogproject.controller.api;

import com.cos.springblogproject.dto.ResponseDto;
import com.cos.springblogproject.model.RoleType;
import com.cos.springblogproject.model.User;
import com.cos.springblogproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/user")
    public ResponseDto<Integer> save(@RequestBody User user) {
        System.out.println("userapicontroller");
        user.setRole(RoleType.USER);
        int result = userService.join(user);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), result);
    }
}