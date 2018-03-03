package com.jungle.gp.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.jungle.gp.user.entity.User;
import com.jungle.gp.user.jpa.UserRepository;
import com.jungle.gp.user.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userDao;
    
    @CachePut(cacheNames = "user", key = "#user.id")
    public User save(User user) {
        return userDao.save(user);
    }

    @Cacheable(cacheNames = "user")
    public User find(Integer id) {
        log.info("find by {}", id);
        return this.userDao.findOne(id);
    }

    @CacheEvict(cacheNames = "user", key = "#p0")
    public int update(Integer id, String name, String mobile) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setMobile(mobile);
        return this.userMapper.update(user);
    }

    @CachePut(cacheNames = "user", key = "#p0")
    public User update2(Integer id, String name, String mobile) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setMobile(mobile);
        this.userMapper.update(user);

        return this.userDao.findOne(id);
    }
}
