package com.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.myapp.models.entities.Role;
import com.myapp.models.entities.User;
import com.myapp.models.repos.UserRepo;

@SpringBootApplication
public class DemoApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
	}

	public void run(String... args) {
		User adminAccount = userRepo.findByRole(Role.ADMIN);

		if (null == adminAccount) {
			User user = new User();

			user.setEmail("admin@gmail.com");
			user.setFirstName("admin");
			user.setLastName("kodein");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("rahasia123"));
			userRepo.save(user);
		}
	}

}
