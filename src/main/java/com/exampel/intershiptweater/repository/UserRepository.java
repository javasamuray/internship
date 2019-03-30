package com.exampel.intershiptweater.repository;

import com.exampel.intershiptweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}