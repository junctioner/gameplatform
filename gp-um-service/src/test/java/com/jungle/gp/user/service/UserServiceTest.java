package com.jungle.gp.user.service;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.jungle.gp.user.BaseTest;
import com.jungle.gp.user.entity.User;

public class UserServiceTest extends BaseTest{
    private final static Logger LOG = LoggerFactory.getLogger(UserServiceTest.class);
	@Autowired
	private UserService userService;

	@Test
	public void testSave() {
		User user = new User();
		user.setMobile("15342359828");
		user.setName("昵称2");
		user.setWeixinId("weixinId2");
		user = userService.save(user);
		
		Assert.assertNotNull(user.getId());
		
		//测试新建时，是否推入缓存中
		User user1 = this.userService.find(user.getId());
		
		Assert.assertEquals("weixinId2",user1.getWeixinId());
	}

	@Test
	public void testCache(){
	    int id = 1;
	    User user = this.userService.find(id);
	    LOG.info("{}",user);
	    Assert.assertEquals(1, user.getId().intValue());
	    
	    this.userService.update(id, "name", "mobile");
	    
	    User user1 = this.userService.find(id);
        LOG.info("{}",user1);
	}
	
	@Test
    public void testCache2(){
        int id = 1;
        User user = this.userService.find(id);
        LOG.info("{}",user);
        Assert.assertEquals(1, user.getId().intValue());
        
        this.userService.update(id, "name", "mobile");
        
        User user1 = this.userService.find(id);
        LOG.info("{}",user1);
    }
	
	@Test(expected=RuntimeException.class)
	public void testTransactional(){
	    this.userService.transactional(1,"事务：name","事务:mobile");
	}
}
