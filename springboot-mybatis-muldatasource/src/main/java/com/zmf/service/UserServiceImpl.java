package com.zmf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmf.dao.slave.UserDao;
import com.zmf.domain.User;
@Service
public   class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public List<User> getUserList() {
		return userDao.getUserList(1);
	}

}
