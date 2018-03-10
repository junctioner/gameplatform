/**
 * Project Name:gp-um-service
 * File Name:UserRedis.java
 * Package Name:com.jungle.gp.user.redis
 * Date:2018年3月3日下午5:03:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.user.redis;

import org.springframework.data.keyvalue.repository.KeyValueRepository;

import com.jungle.gp.user.entity.User;

/**
 * Description:   <br/>
 * Date:     2018年3月3日 下午5:03:57 <br/>
 * @author   thinkpad
 * @version
 * @see
 */
public interface UserRedis extends KeyValueRepository<User, Integer>{

}

