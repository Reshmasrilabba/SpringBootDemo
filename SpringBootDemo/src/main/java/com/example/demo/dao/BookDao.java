package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.BookCreationException;
import com.example.demo.Exception.InvalidAdminException;
import com.example.demo.model.Book;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
@Service
public class BookDao implements BookService {
	@Autowired
	BookRepository bookRepos;
	@Autowired
	AdminRepository AdminRepos;
	@Autowired
	AdminDao dao;

	@Override
	public Book addBook(Book book) throws BookCreationException,InvalidAdminException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String userName=sc.nextLine();
		System.out.println("enter password");
		String userPassword=sc.nextLine();
		if(userName.equals(dao.getAdminName(11)) && userPassword.equals(dao.getAdminPassword(11))) {
			if(bookRepos.existsById(book.getBookId())){
				throw new BookCreationException("book id is available");
			}
			return bookRepos.save(book);
		}
		else {
			throw new InvalidAdminException("Invalid admin");
		}
		
	}

	@Override
	public List<Book> getAllBook(int pagestart, int pageEnd, String sortBy) {
	
		Pageable paging = PageRequest.of(pagestart, pageEnd, Sort.by(sortBy).descending());
		 
        Page<Book> pagedResult = bookRepos.findAll(paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Book>();
        }
      
	}

	public   List<Book> sortName()
      {
      	Sort sort=Sort.by("bookName");
      	return (List<Book>) bookRepos.findAll(sort);
      }

	@Override
	public int updateBook(Book book, long bookId) {
		String bookName=book.getBookName();
		double bookPrice=book.getBookPrice();
	int status=	bookRepos.updateBookById(bookName,bookPrice, bookId);
		return status;
	}
}
