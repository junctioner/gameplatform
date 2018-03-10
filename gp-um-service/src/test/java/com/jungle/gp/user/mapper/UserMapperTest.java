/**
 * Project Name:gp-um-service
 * File Name:UserMapperTest.java
 * Package Name:com.jungle.gp.user.mapper
 * Date:2018年2月25日下午1:52:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.user.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jungle.gp.user.BaseTest;
import com.jungle.gp.user.entity.User;


/**
 * Description: <br/>
 * Date: 2018年2月25日 下午1:52:34 <br/>
 * 
 * @author thinkpad
 * @version
 * @see
 */
public class UserMapperTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1);
        user.setMobile("15342359828");
        user.setName("修改昵称");
        user.setWeixinId("weixinId2");
        int rows = userMapper.update(user);
        
        Assert.assertEquals(1, rows);
    }

}
