package com.zmf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zmf.domain.Account;
@Mapper
public interface AccountDao {
	@Select("select * from account")
	List<Account> getAccount();
}
