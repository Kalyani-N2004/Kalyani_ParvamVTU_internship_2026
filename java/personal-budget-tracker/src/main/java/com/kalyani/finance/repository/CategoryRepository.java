package com.kalyani.finance.repository;

import com.kalyani.finance.entity.Category;
import com.kalyani.finance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByUser(User user);
}