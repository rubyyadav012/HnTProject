package com.hnt.orderService.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import com.hnt.orderService.Entity.User;
import com.hnt.orderService.service.UserService;

@ExtendWith(MockitoExtension.class)

class UserControllerTest {

	@Mock
	UserService userService;

	@InjectMocks
	UserController controller;

	@Test
	void testSaveUser() {
	    User user = new User();
		user.setId(1);
		
		//when(service.save(user)).thenReturn(user);
		when(userService.save(user)).thenReturn(user);
		
	     // Integer saveUser = controller.saveUser(user);
		
		 //assertEquals(1, saveUser);
	}
	
}
