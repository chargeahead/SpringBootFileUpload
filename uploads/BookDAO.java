package com.pluralsight.soap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookDAO {
	List<Book> books = new ArrayList<Book>();

	public BookDAO() {
		super();
		this.books.add(new Book("Harry Potter", "J.K.Rowling"));
		this.books.add(new Book("Good to Great", "Stephen"));
	}

	public List<Book> getBooks() {
		return books;
	}

	public Book getBook(String name) {
		Book book = null;
		Iterator<Book> i = books.iterator();
		while(i.hasNext()){
			Book bk = i.next();
			if(bk.getName().equalsIgnoreCase(name)){
				book = bk;
			}
		}
		return book;
	}

}
