package com.jungle.gp.user.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jungle.gp.user.BaseTest;
import com.jungle.gp.user.entity.User;

public class UserServiceTest extends BaseTest{

	@Autowired
	private UserService userService;

	@Test
	public void testSave() {
		User user = new User();
		user.setId(2);
		user.setMobile("15342359828");
		user.setName("昵称2");
		user.setWeixinId("weixinId2");
		user = userService.save(user);
		
		Assert.assertNotNull(user.getId());
	}

}
