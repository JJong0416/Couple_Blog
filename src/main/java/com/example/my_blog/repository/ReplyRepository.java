package com.example.my_blog.repository;


import com.example.my_blog.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
	
	@Modifying
	@Query(value="INSERT INTO reply(userId, boardId, content, createDate) VALUES(?1,?2,?3,now())",nativeQuery = true)
	int mSave(int userId, int boardId, String content); // JDBC가 기본적으로 Insert나 delete는 return값을 업데이트 된 행의 갯수를 리턴한다. 따라서 반환값을 int로 해야함.
	
}
