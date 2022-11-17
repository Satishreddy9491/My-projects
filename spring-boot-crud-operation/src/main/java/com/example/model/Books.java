package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
	@Id
	@Column
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String bookName;
	@Column
	private String author;
	@Column
	private int price;
	
	public int getId() {
		return id;
	}
	public void setBookiId(int bookId) {
		this.id = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
