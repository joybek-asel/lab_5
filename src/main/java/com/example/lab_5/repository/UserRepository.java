package com.example.lab_5.repository;

import com.example.lab_5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //find user with username
    Optional<User> findByUsername(String username);
}


