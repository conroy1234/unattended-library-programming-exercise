package com.sky.library.repository;

/*
 * Copyright © 2015 Sky plc All Rights reserved.
 * Please do not make your solution publicly available in any way e.g. post in forums or commit to GitHub.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.sky.library.model.Book;

public class BookRepositoryStub implements BookRepository {
    private static final String BOOK_REFERENCE_PREFIX = "BOOK-";

    private static final String THE_GRUFFALO_REFERENCE = BOOK_REFERENCE_PREFIX + "GRUFF472";
    private static final String WINNIE_THE_POOH_REFERENCE = BOOK_REFERENCE_PREFIX + "POOH222";
    private static final String THE_WIND_IN_THE_WILLOWS_REFERENCE = BOOK_REFERENCE_PREFIX + "WILL987";

    private static final Map<String, Book> books;

    static {
        books = new HashMap<String, Book>();
        books.put(THE_GRUFFALO_REFERENCE, new Book(THE_GRUFFALO_REFERENCE, "The Gruffalo", "A mouse taking a walk in the woods."));
        books.put(WINNIE_THE_POOH_REFERENCE, new Book(WINNIE_THE_POOH_REFERENCE, "Winnie The Pooh", "In this first volume, we meet all the friends from the Hundred Acre Wood."));
        books.put(THE_WIND_IN_THE_WILLOWS_REFERENCE, new Book(THE_WIND_IN_THE_WILLOWS_REFERENCE, "The Wind In The Willows", "With the arrival of spring and fine weather outside, " +
                "the good-natured Mole loses patience with spring cleaning. He flees his underground home, emerging to take in the air and ends up at the river, which he has " +
                "never seen before. Here he meets Rat (a water vole), who at this time of year spends all his days in, on and close by the river. Rat takes Mole for a ride " +
                "in his rowing boat. They get along well and spend many more days boating, with Rat teaching Mole the ways of the river."));
    }

  
	@Override
	public <S extends Book> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Book> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Book entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Book> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getBookByReference(String reference) {
		// TODO Auto-generated method stub
		return null;
	}
}
