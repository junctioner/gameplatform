/**
 * Project Name:gp-um-service
 * File Name:UseRedisTest.java
 * Package Name:com.jungle.gp.user.redis
 * Date:2018年3月3日下午4:57:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.user.redis;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jungle.gp.user.BaseTest;
import com.jungle.gp.user.entity.User;

/**
 * Description: <br/>
 * Date: 2018年3月3日 下午4:57:27 <br/>
 * 
 * @author thinkpad
 * @version
 * @see
 */
public class UseRedisTest extends BaseTest {

    @Autowired
    private UserRedis userRedis;

    @Test
    public void testSave() {
        User user = new User();
        user.setId(11);
        user.setMobile("15342359828");
        user.setName("修改昵称");
        user.setWeixinId("weixinId2");

        User user0 = userRedis.save(user);
        
        assertNotNull(user0);
    }
}
