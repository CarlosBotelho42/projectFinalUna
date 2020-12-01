package com.finalProject.projectUna.services;

import com.finalProject.projectUna.entities.Order;
import com.finalProject.projectUna.entities.User;
import com.finalProject.projectUna.repositories.OrderRepository;
import com.finalProject.projectUna.repositories.UserRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id) {
       Optional<Order> obj =  repository.findById(id);
       return obj.get();
    }

}
