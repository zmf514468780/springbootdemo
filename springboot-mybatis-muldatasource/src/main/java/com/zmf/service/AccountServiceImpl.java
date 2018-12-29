package com.zmf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zmf.dao.master.AccountDao;
import com.zmf.domain.Account;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDao accountDao;
	@Override
	public List<Account> getAccount() {
		List<Account> list = accountDao.getAccount();
		return list;
	}
	@Transactional
	public void insertAccount(Account account) {
		accountDao.insertAccount(account);
	 	int i = 1/0;
	}

}
