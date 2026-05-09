package com.kalyani.finance.repository;

import com.kalyani.finance.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository
        extends JpaRepository<Category, Long> {

}