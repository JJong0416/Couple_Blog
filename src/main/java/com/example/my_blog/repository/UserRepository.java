package com.example.my_blog.repository;


import com.example.my_blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
	Optional<User> findByUsername(String username);
}
