package com.selin.Bebka_Spring.service.impl;

import com.selin.Bebka_Spring.model.Book;
import com.selin.Bebka_Spring.repository.BookRepository;
import com.selin.Bebka_Spring.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

     private final BookRepository bookRepository;

     public BookServiceImpl(BookRepository bookRepository) {
          this.bookRepository = bookRepository;
     }

     public Book save(Book book) {
          return bookRepository.save(book);
     }
     public List<Book> findAll() {
          return bookRepository.findAll();
     }
}
