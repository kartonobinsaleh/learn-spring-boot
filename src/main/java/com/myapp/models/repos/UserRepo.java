package com.myapp.models.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.models.entities.Role;
import com.myapp.models.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    User findByRole(Role role);

}
