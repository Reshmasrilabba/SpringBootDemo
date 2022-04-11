package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Exception.BookCreationException;
import com.example.demo.Exception.ErrorMessage;
import com.example.demo.Exception.InvalidAdminException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(BookCreationException.class)
	public @ResponseBody ErrorMessage checkBookCreationException(BookCreationException e) {
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(),e.getMessage());
		return error1;
	}
	@ExceptionHandler(InvalidAdminException.class)
	public @ResponseBody ErrorMessage checkInvalidAdminException(InvalidAdminException e) {
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(),e.getMessage());
		return error1;
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public @ResponseBody ErrorMessage checBookValidationException(MethodArgumentNotValidException e) {
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(),e.getMessage(),e.getBindingResult().toString());
		return error1;
	}



}
