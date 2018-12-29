package com.zmf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zmf.domain.Account;
import com.zmf.service.AccountService; 

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;
	@RequestMapping("/getAccount")
	@ResponseBody
	public List<Account> getAccount(){
		return accountService.getAccount();
	}
	
	 
	@RequestMapping("/insertAccount")
	public String insertAccount(){
		Account account = new Account();
		account.setName("fff");
		account.setMoney(2000);
		accountService.insertAccount(account);
		return "success";
	}
}
