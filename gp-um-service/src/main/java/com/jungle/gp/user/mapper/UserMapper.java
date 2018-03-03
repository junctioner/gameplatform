/**
 * Project Name:gp-um-service
 * File Name:UserMapper.java
 * Package Name:com.jungle.gp.user.mapper
 * Date:2018年2月25日上午11:56:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.jungle.gp.user.entity.User;

/**
 * Description: <br/>
 * Date: 2018年2月25日 上午11:56:36 <br/>
 * 
 * @author thinkpad
 * @version
 * @see
 */
@Mapper
public interface UserMapper {
    @Update("UPDATE user SET name=#{name},mobile=#{mobile} WHERE id =#{id}")
    int update(User user);
}
