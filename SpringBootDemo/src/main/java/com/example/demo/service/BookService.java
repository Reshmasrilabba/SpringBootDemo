package com.example.demo.service;

import java.util.List;

import com.example.demo.Exception.BookCreationException;
import com.example.demo.Exception.InvalidAdminException;
import com.example.demo.model.Book;

public interface BookService {

	public Book addBook(Book book) throws BookCreationException,InvalidAdminException;
	public List<Book> getAllBook(int pagestart, int pageEnd, String sortBy);
	public int updateBook(Book book, long bookId);
	
}
