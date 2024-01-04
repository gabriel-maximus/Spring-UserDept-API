package com.java.gabriel.userdept.repository;

import com.java.gabriel.userdept.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}