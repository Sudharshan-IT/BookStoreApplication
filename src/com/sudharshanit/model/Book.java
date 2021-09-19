package com.sudharshanit.model;

public class Book {

	private Integer bookId;
	private String bookName;
	private String authorName;
	private Double price;
	public Book(Integer bookId, String bookName, String authorName, Double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price
				+ "]";
	}
	
	
}
