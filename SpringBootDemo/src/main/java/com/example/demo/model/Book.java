package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Book_Table")
public class Book {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@DecimalMin(value="2",message="minimum value should be two")
private Long bookId;
	@NotBlank(message="Bookname should not be blank")
private String bookName;
	@NotNull(message="bookprice should not be null")
private double bookPrice;
	/*
	 * @Size(min=8,message)
	 * abc@org.xyz.in
	 * @Pattern(regexp=
	 * 
	 * 
	 * step1-add validation dependencies
	 * step2-add the contrains like @notnull,@notblank to the attributes
	 * step3-add exception class in globalExceptionHandler
	 * step4-add @Valid before the @RequestBody in controller class
	 */
public Long getBookId() {
	return bookId;
}
public void setBookId(Long bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}


	
}
