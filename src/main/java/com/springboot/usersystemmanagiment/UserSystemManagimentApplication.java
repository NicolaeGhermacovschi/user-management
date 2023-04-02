package com.springboot.usersystemmanagiment;

import com.springboot.usersystemmanagiment.entity.User;
import com.springboot.usersystemmanagiment.repository.UserRepository;
import com.springboot.usersystemmanagiment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserSystemManagimentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserSystemManagimentApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
	}
}
