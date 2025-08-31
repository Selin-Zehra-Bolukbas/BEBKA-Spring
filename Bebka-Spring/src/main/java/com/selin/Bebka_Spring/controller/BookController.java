package com.selin.Bebka_Spring.controller;

import com.selin.Bebka_Spring.model.Book;
import com.selin.Bebka_Spring.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return bookService.save(book);
    }
    @GetMapping
    public List<Book> getAll() {
        return bookService.findAll();
    }

}
