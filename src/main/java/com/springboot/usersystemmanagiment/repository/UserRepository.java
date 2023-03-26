package com.springboot.usersystemmanagiment.repository;

import com.springboot.usersystemmanagiment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
