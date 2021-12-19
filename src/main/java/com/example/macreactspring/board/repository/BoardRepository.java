package com.example.macreactspring.board.repository;

import com.example.macreactspring.board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}
