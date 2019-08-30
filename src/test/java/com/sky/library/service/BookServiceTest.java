package com.sky.library.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response.Status;

import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sky.library.exception.BookNotFoundException;
import com.sky.library.model.Book;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class BookServiceTest {
	
	

	@Autowired
	private MockMvc mockMvc;
	
	private BookService bookService = mock(BookService.class);

		
	@Test
	public void retrieveBookTest() throws Exception {
		String reference = "GRUFF472";
		Book book = new Book("BOOK-GRUFF472","The Gruffalo,review","A mouse taking a walk in the woods");		
		when(bookService.retrieveBook(reference)).thenReturn(book);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/book/BOOK-GRUFF472").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		assertNotNull(result);	
		
	}
	
	@Test
	public void getBookSummaryTest() throws Exception {			
		List<Book> books = new ArrayList<>();
		books.add(new Book("BOOK-GRUFF472","The Gruffalo","A mouse taking a walk in the woods"));
		books.add(new Book("BOOK-POOH222","TWinnie The Pooh","In this first volume, we meet all the friends"));		
		books.add(new Book("BOOK-WILL987","The Wind In The Willows","With the arrival of spring and fine weather outside"));
		
		when(bookService.getBookSummary()).thenReturn(books);
		
		assertThat(books.size(),is(3));
		
	}

	
}
