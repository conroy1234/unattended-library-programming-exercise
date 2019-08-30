package com.sky.library.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Copyright © 2015 Sky plc All Rights reserved.
 * Please do not make your solution publicly available in any way e.g. post in forums or commit to GitHub.
 */
@Entity
@Table(name = "BOOK")
public class Book implements Serializable {
	@Id	
	private String reference;
	private String title;
	private String review;

	public Book() {

	}

	public Book(String reference, String title, String description) {
		this.reference = reference;
		this.title = title;
		this.review = description;
	}

	
	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getReview() {
		return review;
	}

	public String getReference() {
		return reference;
	}

	public String getTitle() {
		return title;
	}
}
