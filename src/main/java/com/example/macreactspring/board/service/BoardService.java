package com.example.macreactspring.board.service;

import com.example.macreactspring.board.model.Board;
import com.example.macreactspring.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getAllBoard() {
        return boardRepository.findAll();
    }
}
