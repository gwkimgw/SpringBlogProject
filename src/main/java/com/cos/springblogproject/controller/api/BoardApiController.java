package com.cos.springblogproject.controller.api;

import com.cos.springblogproject.config.auth.PrincipalDetail;
import com.cos.springblogproject.dto.ReplySaveRequestDto;
import com.cos.springblogproject.dto.ResponseDto;
import com.cos.springblogproject.model.Board;
import com.cos.springblogproject.model.Reply;
import com.cos.springblogproject.model.User;
import com.cos.springblogproject.service.BoardService;
import com.cos.springblogproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardApiController {
    @Autowired
    private BoardService boardService;

    @PostMapping("/api/board")
    public ResponseDto<Integer> save(@RequestBody Board board, @AuthenticationPrincipal PrincipalDetail principal) {
        boardService.write(board, principal.getUser());
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }

    @DeleteMapping("/api/board/{id}")
    public ResponseDto<Integer> deleteById(@PathVariable int id) {
        boardService.delete(id);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }

    @PutMapping("/api/board/{id}")
    public ResponseDto<Integer> update(@PathVariable int id, @RequestBody Board board){
        boardService.edit(id, board);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }

    @PostMapping("/api/board/{boardId}/reply")
    public ResponseDto<Integer> saveReply(@RequestBody ReplySaveRequestDto reply) {
        boardService.writeReply(reply);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }

    @DeleteMapping("/api/board/{boardId}/reply/{replyId}")
    public ResponseDto<Integer> replyDelete(@PathVariable int replyId) {
        boardService.deleteReply(replyId);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }
}