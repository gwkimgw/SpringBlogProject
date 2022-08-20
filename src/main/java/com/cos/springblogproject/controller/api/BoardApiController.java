package com.cos.springblogproject.controller.api;

import com.cos.springblogproject.config.auth.PrincipalDetail;
import com.cos.springblogproject.dto.ResponseDto;
import com.cos.springblogproject.model.Board;
import com.cos.springblogproject.model.User;
import com.cos.springblogproject.service.BoardService;
import com.cos.springblogproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardApiController {
    @Autowired
    private BoardService boardService;

    @PostMapping("/api/joinProc")
    public ResponseDto<Integer> save(@RequestBody Board board, @AuthenticationPrincipal PrincipalDetail principal) {
        boardService.write(board, principal.getUser());
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }
}