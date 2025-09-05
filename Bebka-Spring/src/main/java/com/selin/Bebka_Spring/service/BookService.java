package com.selin.Bebka_Spring.service;

import com.selin.Bebka_Spring.model.Book;
import com.selin.Bebka_Spring.repository.BookRepository;
import com.selin.Bebka_Spring.service.impl.BookServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    Book save(Book book);
    List<Book> findAll();



}
