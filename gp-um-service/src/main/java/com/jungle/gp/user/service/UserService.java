package com.jungle.gp.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jungle.gp.user.entity.User;
import com.jungle.gp.user.jpa.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userDao;

	public User save(User user) {
		return userDao.save(user);
	}
	
	public User find(Integer id){
	    return this.userDao.findOne(id);
	}
}
