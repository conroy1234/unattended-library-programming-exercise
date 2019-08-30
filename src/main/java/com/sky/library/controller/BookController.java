package com.sky.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sky.library.exception.BookNotFoundException;
import com.sky.library.model.Book;
import com.sky.library.service.BookService;

@Controller
@RequestMapping("/")
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "/all-books", method = RequestMethod.GET)
	public String getBookSummary(Model model, @ModelAttribute Book book) throws BookNotFoundException {
		Iterable<Book> books = (List<Book>) bookService.getBookSummary();
		model.addAttribute("books", books);
		if (ObjectUtils.isEmpty(books)) {
			model.addAttribute("exceptions",
					new BookNotFoundException("BOOK-999 BookNotFoundException has been thrown "));
			return "exception";
		}

		return "book";
	}

	@RequestMapping(value = "/book/{reference}", method = RequestMethod.GET)
	public String retrieveBook(Model model, @PathVariable String reference) throws BookNotFoundException {
		Book book = bookService.retrieveBook(reference);
		model.addAttribute("book", book);
		return "result";
	}

}
