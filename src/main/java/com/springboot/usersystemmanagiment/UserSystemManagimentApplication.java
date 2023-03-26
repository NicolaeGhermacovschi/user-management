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
//		User user1 = new User(181161L,"nicolae","nic","nic@gmail.com");
//		userRepository.save(user1);
//		User user2 = new User(18116121L,"nicolae","genfe","nic@gmail.com");
//		userRepository.save(user2);

	}
}
