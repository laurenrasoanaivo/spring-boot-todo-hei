package com.example.springsecuritydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springsecuritydemo.model.UserAuth;
import com.example.springsecuritydemo.repository.UserAuthRepository;
 
@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
 
    @Autowired
    private UserAuthRepository repository;
 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
 
        UserAuth user = repository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
 
        return user;
 
    }
 
}