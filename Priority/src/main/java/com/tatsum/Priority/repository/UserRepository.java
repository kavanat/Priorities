package com.tatsum.Priority.repository;

import com.tatsum.Priority.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
