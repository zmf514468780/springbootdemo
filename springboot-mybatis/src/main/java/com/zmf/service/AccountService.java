package com.zmf.service;

import java.util.List;

import com.zmf.domain.Account;
import com.zmf.domain.AutoUUID;

public interface AccountService {
	
	List<Account> getAccount();
	void insertAccount(Account account);
	void insertUUID(AutoUUID autoUUID);
	void insertUserAuto(String sql);
}
