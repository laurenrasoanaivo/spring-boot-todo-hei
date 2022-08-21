package com.example.springsecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springsecuritydemo.model.UserAuth;

@Repository
public interface UserAuthRepository extends JpaRepository<UserAuth, Integer> {
    public UserAuth findByUsername(String username);
}