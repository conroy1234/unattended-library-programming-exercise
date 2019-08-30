package com.sky.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sky.library.exception.BookNotFoundException;
import com.sky.library.model.Book;

/*
 * Copyright © 2015 Sky plc All Rights reserved.
 * Please do not make your solution publicly available in any way e.g. post in forums or commit to GitHub.
 */

@Service
public interface BookService {
    Book retrieveBook(String bookReference) throws BookNotFoundException;
    List<Book> getBookSummary() throws BookNotFoundException;
}
