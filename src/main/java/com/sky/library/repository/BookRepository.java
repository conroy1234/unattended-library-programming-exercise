package com.sky.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sky.library.model.Book;

/*
 * Copyright © 2015 Sky plc All Rights reserved.
 * Please do not make your solution publicly available in any way e.g. post in forums or commit to GitHub.
 */

@Repository
public interface BookRepository extends CrudRepository<Book,String> {
    Book getBookByReference(String reference);
}
