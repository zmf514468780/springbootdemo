package com.zmf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zmf.dao.AccountDao;
import com.zmf.domain.Account;
import com.zmf.domain.AutoUUID;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDao accountDao;
	
	public List<Account> getAccount() {
		List<Account> list = accountDao.getAccount();
		System.out.println("   cccccccccccc");
		return list;
	}
	@Transactional
	@Override
	public void insertAccount(Account account) {
		accountDao.insertAccount(account);
		int i = 1/0;
	}
	
	@Override
	public void insertUUID(AutoUUID autoUUID) {
		accountDao.insertUUID(autoUUID);
	}
	@Override
	public void insertUserAuto(String sql) {
		accountDao.insertUserAuto(sql);
		
	}
	

}
