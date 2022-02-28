package com.example.springbootsqlserver.repository;

import com.example.springbootsqlserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
