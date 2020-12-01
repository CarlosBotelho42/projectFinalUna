package com.finalProject.projectUna.repositories;

import com.finalProject.projectUna.entities.Category;
import com.finalProject.projectUna.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
