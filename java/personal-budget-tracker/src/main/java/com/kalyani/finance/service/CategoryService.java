package com.kalyani.finance.service;

import com.kalyani.finance.entity.Category;
import com.kalyani.finance.entity.User;
import com.kalyani.finance.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // save category
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    // get user categories
    public List<Category> getUserCategories(User user) {
        return categoryRepository.findByUser(user);
    }
}