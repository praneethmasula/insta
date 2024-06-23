package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Friends;
import com.example.demo.entity.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message, Integer>{

	@Query(value = "select* from message m where ( m.fromm=:id and m.too=:fid ) or (m.fromm=:fid and m.too=:id)",nativeQuery = true)
	public List<Message> getByID(@Param("id") String id,@Param("fid") String fid);
	
	@Query(value = "select* from message m where  m.too=:fid or m.fromm=:fid",nativeQuery = true)
	public List<Message> getByLoggedInUSer(@Param("fid") String fid);
}
