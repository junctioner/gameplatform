package com.jungle.gp.user.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jungle.gp.user.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {    
    
}
