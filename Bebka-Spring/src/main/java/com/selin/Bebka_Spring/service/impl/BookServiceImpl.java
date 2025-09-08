package com.selin.Bebka_Spring.service.impl;

import com.selin.Bebka_Spring.model.Book;
import com.selin.Bebka_Spring.repository.BookRepository;
import com.selin.Bebka_Spring.service.BookService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

     private final BookRepository bookRepository;

     public BookServiceImpl(BookRepository bookRepository) {
          this.bookRepository = bookRepository;
     }
     @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
     public Book save(Book book) {
          return bookRepository.save(book);
     }
     @Override
     public List<Book> findAll() {
          return bookRepository.findAll();
     }
}
