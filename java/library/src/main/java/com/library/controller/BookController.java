package com.library.controller;

import com.library.entity.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    // ➕ Add Book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.saveBook(book);
    }

    // 📄 Get all Books
    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    // 🔍 Get Book by ID
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return service.getBookById(id);
    }
    
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book existing = service.getBookById(id);

        existing.setTitle(book.getTitle());
        existing.setPrice(book.getPrice());
        existing.setAuthor(book.getAuthor());

        return service.saveBook(existing);
    } 
    // ❌ Delete Book
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
        return "Book deleted successfully";
    }
}