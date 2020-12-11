package com.finalProject.projectUna.repositories;

import com.finalProject.projectUna.entities.Category;
import com.finalProject.projectUna.entities.Order;
import com.finalProject.projectUna.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
