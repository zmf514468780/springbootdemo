package com.zmf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zmf.domain.Account;
import com.zmf.domain.AutoUUID;
 
public interface AccountDao {
	List<Account> getAccount();
	void insertAccount(Account account);
	void insertUUID(AutoUUID autoUUID);
	void insertUserAuto(@Param("sql") String sql);
}
 