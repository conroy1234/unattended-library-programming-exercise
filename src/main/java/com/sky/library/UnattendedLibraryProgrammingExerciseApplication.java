package com.sky.library;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sky.library.model.Book;
import com.sky.library.service.BookService;

@SpringBootApplication
public class UnattendedLibraryProgrammingExerciseApplication{
	
	@Autowired
	BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(UnattendedLibraryProgrammingExerciseApplication.class, args);
	}

	
	

}
