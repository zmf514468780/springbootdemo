package com.zmf.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zmf.entity.Message;

public interface MessageDao extends  JpaRepository<Message, Serializable>{
	@Query(nativeQuery=true,value= "SELECT id,  message_name FROM  message  ")
	List<Object[]> findMessageAll();
}
