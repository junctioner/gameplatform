/**
 * Project Name:gp-um-service
 * File Name:UserMongoTest.java
 * Package Name:com.jungle.gp.user.mongo
 * Date:2018年3月3日下午3:16:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.user.mongo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jungle.gp.user.BaseTest;
import com.jungle.gp.user.entity.User;

/**
 * Description: <br/>
 * Date: 2018年3月3日 下午3:16:55 <br/>
 * 
 * @author thinkpad
 * @version
 * @see
 */
public class UserMongoTest extends BaseTest {

    @Autowired
    private UserMongo userMongo;

    @Test
    public void testInsertS() {
        User user = new User();
        user.setId(10);
        user.setMobile("15342359828");
        user.setName("修改昵称");
        user.setWeixinId("weixinId2");
        User user0 = userMongo.insert(user);

        User user1 = userMongo.findOne(user0.getId());

        assertEquals(user.getMobile(), user1.getMobile());
    }

    @Test
    public void testFindOne() {
        
        Integer id = 10;
        User user1 = userMongo.findOne(id);
        
        System.out.println(user1);
        
        assertEquals(id, user1.getId());
    }

}
