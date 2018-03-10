package com.jungle.gp.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
    
    @CachePut(cacheNames = "user", key = "#user.id.toString()")
    public User save(User user) {
        
        return userDao.save(user);
    }

    @Cacheable(cacheNames = "user", key = "#p0.toString()")
    public User find(Integer id) {
        log.info("find by {}", id);
        return this.userDao.findOne(id);
    }

    @CacheEvict(cacheNames = "user", key = "#p0.toString()")
    public int update(Integer id, String name, String mobile) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setMobile(mobile);
        return this.userMapper.update(user);
    }

    
    @CachePut(cacheNames = "user", key = "#p0.toString()")
    public User update2(Integer id, String name, String mobile) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setMobile(mobile);
        this.userMapper.update(user);

        return this.userDao.findOne(id);
    }
    
    @Transactional(
            /**
             * 隔离级别<br>
             * TransactionDefinition.ISOLATION_DEFAULT：默认级别，采用数据库自有的<br>
             * TransactionDefinition.ISOLATION_READ_UNCOMMITTED：可以读取其它事务未提交的数据(使用场景比较少)<br>
             * TransactionDefinition.ISOLATION_READ_COMMITTED：读取已提交数据，防止脏读（大部分场景使用）<br>
             * TransactionDefinition.ISOLATION_REPEATABLE_READ：可重复读取，每次查询的数据一样，（可以防止脏读和不可重复读）<br>
             * TransactionDefinition.ISOLATION_SERIALIZABLE：所有事务序列化的执行（按顺序执行），可以防止脏读、不可重复读以及幻读（性能差）<br>
             * <br>
             * 幻读：在一个事务中，同一查询条件，多次查询的结果数不一样（看到一个鬼影了）<br>
             * 不可重复读：对同一数据，两次读取的结果不一样（两次读取之间，其它事务修改并提交了该数据），导致不可多次读取数据，<br>
             * 脏读：读取了准备提交，但未提交成功的数据(垃圾数据)<br>
             */
            isolation=Isolation.DEFAULT,
            
            /**
             * 传播机制<br>
             * Propagation.REQUIRED：有事务，就使用当前事务；没有事务，创建一个新事务<br>
             * Propagation.SUPPORTS：有事务，就使用当前事务；没有事务，就不执行事务<br>
             * Propagation.MANDATORY：有事务，就使用当前事务；没有事务，抛出异常<br>
             * Propagation.REQUIRES_NEW：创建新事务，挂起旧事务<br>
             * Propagation.NOT_SUPPORTED：不执行事务，挂起旧事务<br>
             * Propagation.NEVER：不执行事务，有事务，抛出异常<br>
             * Propagation.NESTED：有事务，则执行嵌套事务<br>
             */
            propagation=Propagation.REQUIRED)
    public void transactional(Integer id, String name, String mobile){
        boolean bol = true;
        
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setMobile(mobile);
        this.userMapper.update(user);
        if(bol){
            throw new RuntimeException();
        }
        //log.info("测试事务是否执行到此节点");
    }
}
