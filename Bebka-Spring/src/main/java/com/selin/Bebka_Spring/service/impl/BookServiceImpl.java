package com.selin.Bebka_Spring.service.impl;

import com.selin.Bebka_Spring.model.Book;

import java.util.List;

public interface BookServiceImpl {

     Book save(Book book);
     List<Book> findAll();

}
