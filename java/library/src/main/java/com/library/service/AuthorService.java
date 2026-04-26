package com.library.service;

import com.library.entity.Author;
import com.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository repository;

    // ➕ Save Author
    public Author saveAuthor(Author author) {
        return repository.save(author);
    }

    // 📄 Get All Authors
    public List<Author> getAllAuthors() {
        return repository.findAll();
    }

    // 🔍 Get Author by ID
    public Author getAuthorById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // ❌ Delete Author
    public void deleteAuthor(Long id) {
        repository.deleteById(id);
    }
}