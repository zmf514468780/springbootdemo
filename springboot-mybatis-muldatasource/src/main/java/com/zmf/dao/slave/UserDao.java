package com.zmf.dao.slave;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Primary;

import com.zmf.domain.User;
@Mapper
public interface UserDao {
	@Select("select * from user where id = #{id}")
	List<User> getUserList(@Param("id") int id);
	
	
}
