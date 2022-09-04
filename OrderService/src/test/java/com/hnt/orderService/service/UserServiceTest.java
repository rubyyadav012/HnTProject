package com.hnt.orderService.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.hnt.orderService.Entity.User;
import com.hnt.orderService.repository.UserRepository;
@ExtendWith(MockitoExtension.class)
class UserServiceTest {
	
	
	
	@Mock
	  UserRepository repository;

	@InjectMocks
	UserService service;
	
	
	
	@Test
	void testsaveUser() {
		User user=new User();
		user.setId(1);
		user.setName("ruby");
		when(repository.save(user)).thenReturn(user);
		service.save(user);
		assertEquals(1, user.getId());
		
		
	}
		
	
	@Test
	void testgetUser() {
		User user=new User();
		
		user.setId(1);
		//user.setAge(23);
		user.setName("ruby");
		List<User> list=new ArrayList<User>();
		list.add(user);
		when(repository.findAll()).thenReturn(list);
		//List<> ls=userService.getUser();
		assertEquals(1, service.getUser().size());
		
	
	}
	
	

}
