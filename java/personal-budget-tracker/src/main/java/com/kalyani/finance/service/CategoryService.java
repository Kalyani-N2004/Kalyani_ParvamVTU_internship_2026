package com.kalyani.finance.service;

import com.kalyani.finance.entity.Category;
import com.kalyani.finance.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Save category
    public Category saveCategory(Category category) {

        return categoryRepository.save(category);
    }

    // Get all categories
    public List<Category> getAllCategories() {

        return categoryRepository.findAll();
    }
}