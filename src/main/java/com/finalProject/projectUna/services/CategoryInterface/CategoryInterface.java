package com.finalProject.projectUna.services.CategoryInterface;

import com.finalProject.projectUna.entities.Category;

import java.util.List;

public interface CategoryInterface {
    
    public Category get(Long id);

    public List<Category> findAll();

    public Category create(Category Category);

    public void update(Category Category);

    public void remove(Long id);
    
}
