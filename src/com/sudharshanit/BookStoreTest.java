package com.sudharshanit;

import java.util.ArrayList;
import java.util.List;

import com.sudharshanit.model.Book;

public class BookStoreTest {
	
	public void addBook(List<Book> bookList) {
		System.out.println("**** Book List ******");
		bookList.forEach(book->System.out.println(book));
	}
	public static void main(String[] args) {
		System.out.println("Welcome To Book Store");
		List<Book> bookList=new  ArrayList<>();
		BookStoreTest bookStore=new BookStoreTest();
		bookList.add(new Book(101,"Spring Framework","Nataraz",250.0));
		bookList.add(new Book(101,"Microservices","Sudharshan",2250.0));
		bookList.add(new Book(101,"Hiberanate Framework","Nataraz",650.0));
		bookList.add(new Book(101,"Java","HariKrishna",750.0));
		bookList.add(new Book(101,"SpringBoot And Microservices","Ashok",450.0));
		bookStore.addBook(bookList);		

	}

}
