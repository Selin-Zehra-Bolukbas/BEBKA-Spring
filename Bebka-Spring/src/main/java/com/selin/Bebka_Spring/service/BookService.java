package com.selin.Bebka_Spring.service;

import com.selin.Bebka_Spring.model.Book;
import com.selin.Bebka_Spring.repository.BookRepository;
import com.selin.Bebka_Spring.service.impl.BookServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookServiceImpl {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
