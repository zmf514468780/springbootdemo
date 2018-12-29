package com.zmf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zmf.domain.Account;
import com.zmf.domain.AutoUUID;
import com.zmf.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;
	@RequestMapping("/getAccounts")
	public List<Account> getAccount(){
		return accountService.getAccount();
	}
	@RequestMapping("/insertAccount/{name}/{money}")
	public String insertAccount(@PathVariable("name") String name ,@PathVariable("money") String money ){
		System.out.println(name +" "+ money);
		System.out.println();
//		Account account = new Account();
//		account.setName("fff");
//		account.setMoney(2000);
//		accountService.insertAccount(account);
		return "success";
	}
	
	
	@RequestMapping("/insertUUID")
	public String insertUUID(){
		AutoUUID autoUUID = new AutoUUID();
		accountService.insertUUID(autoUUID);
		System.out.println(autoUUID.getId()/3);
		String sql  = "insert into user_"+autoUUID.getId()%3+ "(id,username) values("+autoUUID.getId()+",'name_"+autoUUID.getId()+"')";
		accountService.insertUserAuto(sql);
		return sql;
	}
}
