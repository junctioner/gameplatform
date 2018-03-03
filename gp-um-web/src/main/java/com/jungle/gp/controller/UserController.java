/**
 * Project Name:gp-um-web
 * File Name:UserController.java
 * Package Name:com.jungle.gp.controller
 * Date:2018年2月24日下午4:12:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jungle.gp.ro.Result;
import com.jungle.gp.ro.ResultData;
import com.jungle.gp.user.entity.User;
import com.jungle.gp.user.service.UserService;

/**
 * Description:   <br/>
 * Date:     2018年2月24日 下午4:12:58 <br/>
 * @author   thinkpad
 * @version
 * @see
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("find")
    public ResultData<User> find(Integer id){
       return new ResultData<User>(this.userService.find(id));
    }
    
    @RequestMapping("create")
    public Result create(User user){
        this.userService.save(user);
        return new Result();
    }
    @RequestMapping("update")
    public Result update(User user){
        this.userService.save(user);
        return new Result();
    }
}

