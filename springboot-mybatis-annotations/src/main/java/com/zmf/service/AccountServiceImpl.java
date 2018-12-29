package com.zmf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmf.dao.AccountDao;
import com.zmf.domain.Account;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDao accountDao;
	
	public List<Account> getAccount() {
		List<Account> list = accountDao.getAccount();
		System.out.println("   cccccccccccc");
		return list;
	}

}
