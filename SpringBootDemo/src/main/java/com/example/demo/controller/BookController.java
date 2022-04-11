package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.BookCreationException;
import com.example.demo.Exception.InvalidAdminException;
import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;

@RestController
public class BookController {
@Autowired
BookDao dao;
Logger log=org.slf4j.LoggerFactory.getLogger(BookController.class);
@PostMapping(path="/createBook")
public Book createBook(@Valid @RequestBody Book book) throws BookCreationException, InvalidAdminException
{
	Book b=dao.addBook(book);
	if(b!=null) {
		log.info("Book object created");
	}
	else {
		log.error("sorry not able to create book");
	}
	return dao.addBook(book);
}
	
@GetMapping(path="/getAllBook/{s}/{e}/{sortBy}")
public List<Book> getAllBook(@PathVariable int s, @PathVariable int e,@PathVariable String sortBy)
{
	return dao.getAllBook(s, e, sortBy);
}
@GetMapping(path="/sortByName")
public List<Book> sortBook()
{
	return dao.sortName();
}
/*
 * {
        "bookId": 8,
        "bookName": "Hibernate Programming 2",
        "bookPrice": 850.0
    }
    {
        "adminId": 2,
        "user":{
            "userId":13,
            "userName":"shiny",
            "userPassword":"shiny12"
        }
    }
    json object converted Java object
    HttpMessageConverter
    
 * 
 * 
 * 
 */
@PutMapping( path="/updateBookById")
public int updateBook(@Valid @RequestBody Book book)
{
	return dao.updateBook(book, book.getBookId());
}


}
