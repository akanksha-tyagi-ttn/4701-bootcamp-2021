package com.jvmbootcamp.springsecurityoath.dao;

import com.jvmbootcamp.springsecurityoath.repos.UserRepository;
import com.jvmbootcamp.springsecurityoath.auth.AppUser;
import com.jvmbootcamp.springsecurityoath.auth.GrantAuthorityImpl;
import com.jvmbootcamp.springsecurityoath.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public class UserDao {

    @Autowired
    UserRepository userRepository;

    public AppUser loadUserByUsername(String username){
        User user  = userRepository.findByUsername(username);
        if(username != null){
            return new AppUser(user.getUsername(), user.getPassword(), Arrays.asList(new GrantAuthorityImpl(user.getRole())));
        }else{
            throw new RuntimeException();
        }
    }
}
