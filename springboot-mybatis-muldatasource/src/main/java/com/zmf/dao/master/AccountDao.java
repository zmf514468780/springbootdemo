package com.zmf.dao.master;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Primary;

import com.zmf.domain.Account;

public interface AccountDao {
	List<Account> getAccount();
	void insertAccount(Account account);
	}
