package com.finalProject.projectUna.repositories;

import com.finalProject.projectUna.entities.Category;
import com.finalProject.projectUna.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
