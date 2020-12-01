package com.finalProject.projectUna.repositories;

import com.finalProject.projectUna.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
