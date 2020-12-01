package com.finalProject.projectUna.repositories;

import com.finalProject.projectUna.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
