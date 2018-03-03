/**
 * Project Name:gp-um-service
 * File Name:User.java
 * Package Name:com.jungle.gp.user.mongo
 * Date:2018年3月3日下午3:13:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.user.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jungle.gp.user.entity.User;

/**
 * Description:   <br/>
 * Date:     2018年3月3日 下午3:13:23 <br/>
 * @author   thinkpad
 * @version
 * @see
 */
public interface UserMongo extends MongoRepository<User,Integer>{

}

