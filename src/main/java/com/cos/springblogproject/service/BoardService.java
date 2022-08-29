package com.cos.springblogproject.service;

import com.cos.springblogproject.dto.ReplySaveRequestDto;
import com.cos.springblogproject.model.Board;
import com.cos.springblogproject.model.Reply;
import com.cos.springblogproject.model.User;
import com.cos.springblogproject.repository.BoardRepository;
import com.cos.springblogproject.repository.ReplyRepository;
import com.cos.springblogproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private ReplyRepository replyRepository;

    @Transactional
    public void write(Board board, User user) {
        board.setCount(0);
        board.setUser(user);
        boardRepository.save(board);
    }

    public Page<Board> getList(Pageable pageable) {
        return boardRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Board getContent(int id) {
        return boardRepository.findById(id)
                .orElseThrow(() -> {
                    return new IllegalArgumentException("failed: no such id");
                });
    }

    @Transactional
    public void delete(int id) {
        boardRepository.deleteById(id);
    }

    @Transactional
    public void edit(int id, Board requestBoard) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> {
                    return new IllegalArgumentException("failed: no such id");
                });
        board.setTitle(requestBoard.getTitle());
        board.setContent(requestBoard.getContent());
    }

    @Transactional
    public void writeReply(ReplySaveRequestDto replySaveRequestDto) {
//        User user = userRepository.findById(replySaveRequestDto.getUserId()).orElseThrow(() -> {
//            return new IllegalArgumentException("failed: no such user");
//        });
//        Board board = boardRepository.findById(replySaveRequestDto.getBoardId()).orElseThrow(() -> {
//            return new IllegalArgumentException("failed: no such board");
//        });
//        Reply reply = new Reply();
//        reply.update(user, board, replySaveRequestDto.getContent());

//        Reply reply = Reply.builder()
//                .user(user)
//                .board(board)
//                .content(replySaveRequestDto.getContent())
//                .build();

        replyRepository.mySave(replySaveRequestDto.getUserId()
                , replySaveRequestDto.getBoardId(), replySaveRequestDto.getContent());
    }

    @Transactional
    public void deleteReply(int replyId) {
        replyRepository.deleteById(replyId);
    }
}
