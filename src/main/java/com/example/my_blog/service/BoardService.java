package com.example.my_blog.service;

import com.example.my_blog.model.Board;
import com.example.my_blog.repository.BoardRepository;
import com.example.my_blog.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private ReplyRepository replyRepository;

    @Transactional(readOnly = true)
    public Page<Board> 글목록(Pageable pageable ){
        return boardRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Board 글상세보기(Long id) {
        return boardRepository.findById(id)
                .orElseThrow(()->{
                    return new IllegalArgumentException("글 상세보기 실패: 아이디를 찾을 수 없습니다.");
                });
    }

}
