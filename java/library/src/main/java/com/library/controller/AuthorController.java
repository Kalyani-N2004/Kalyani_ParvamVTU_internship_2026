package com.library.controller;

import com.library.entity.Author;
import com.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService service;

    // ➕ Add Author
    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return service.saveAuthor(author);
    }

    // 📄 Get all Authors
    @GetMapping
    public List<Author> getAllAuthors() {
        return service.getAllAuthors();
    }
    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return service.getAuthorById(id);
    }
    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author author) {

        Author existing = service.getAuthorById(id);

        existing.setName(author.getName());
        existing.setEmail(author.getEmail());

        return service.saveAuthor(existing);
    }
    @DeleteMapping("/{id}")
    public String deleteAuthor(@PathVariable Long id) {
        service.deleteAuthor(id);
        return "Author deleted successfully";
    }
}