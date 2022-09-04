package com.hnt.orderService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.orderService.Entity.User;
import com.hnt.orderService.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	  UserRepository userRespository;
	
	public User save(User user) {
		return userRespository.save(user);
	}

	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userRespository.findAll();
	}

	public void delete(int userid) {
		userRespository.deleteById(userid);
	}


}
