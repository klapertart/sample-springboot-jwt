package com.klapertart.jwt.repositories;

import org.springframework.stereotype.Repository;

import com.klapertart.jwt.model.User;
/**
 * @author tritronik
 * @since 9/13/2024
 */

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        User user = new User(email,"123456");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        return user;
    }
}