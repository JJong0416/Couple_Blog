package com.example.my_blog.repository;


import com.example.my_blog.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
	
}
