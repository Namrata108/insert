package com.java.data.servicesImpl;

import com.java.data.model.User;
import com.java.data.services.UserServices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.data.dao.Userdao;

@Service
public class userservicesImpl implements UserServices{

	@Autowired
	Userdao userdao;
	
	public void insertuser(User user) {
		userdao.insertUser(user);
	}


}
