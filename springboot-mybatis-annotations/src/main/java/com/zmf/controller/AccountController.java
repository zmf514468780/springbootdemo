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
	@RequestMapping("/getAccounts")
	@ResponseBody
	public List<Account> getAccount(){
		return accountService.getAccount();
	}
}
