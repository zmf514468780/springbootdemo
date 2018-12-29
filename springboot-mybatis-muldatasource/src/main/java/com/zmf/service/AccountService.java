package com.zmf.service;

import java.util.List;

import com.zmf.domain.Account;

public interface AccountService {
	
	List<Account> getAccount();
	void insertAccount(Account account);
}
