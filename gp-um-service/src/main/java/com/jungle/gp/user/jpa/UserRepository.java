package com.jungle.gp.user.jpa;

import org.springframework.data.repository.CrudRepository;

import com.jungle.gp.user.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
