package com.library.service;

import com.library.entity.Author;
import com.library.entity.Book;
import com.library.repository.AuthorRepository;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    @Autowired
    private AuthorRepository authorRepository;

    // ➕ Save Book (FIXED)
    public Book saveBook(Book book) {

        // STEP 1: Validate input
        if (book.getAuthor() == null || book.getAuthor().getId() == null) {
            throw new RuntimeException("Author ID is required");
        }

        Long authorId = book.getAuthor().getId();

        // STEP 2: Fetch author from DB
        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new RuntimeException("Author not found"));

        // STEP 3: Attach full author entity
        book.setAuthor(author);

        // STEP 4: Save book
        return repository.save(book);
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book getBookById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }
}