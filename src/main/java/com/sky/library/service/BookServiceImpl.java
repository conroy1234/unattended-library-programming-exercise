package com.sky.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.library.exception.BookNotFoundException;
import com.sky.library.model.Book;
import com.sky.library.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public Book retrieveBook(String bookReference) throws BookNotFoundException {
		Book book =  bookRepository.getBookByReference(bookReference);
		if(book==null) {
			throw new BookNotFoundException("book return empty result");
		}		
		return book;
	}

	@Override
	public List<Book> getBookSummary() throws BookNotFoundException {
		
		return (List<Book>) bookRepository.findAll();
	}

}
