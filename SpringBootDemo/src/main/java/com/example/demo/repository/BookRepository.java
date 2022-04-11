package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
	
	@Transactional
	@Modifying
	@Query(value = "update  Book b set b.bookName =?1, b.bookPrice=?2 where b.bookId=?3")
	public int updateBookById(String bookName,double bookPrice, long bookId);

}
