package com.example.demo.Exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorMessage {
	private LocalDateTime date;
	private String errorMsg;
	private String validationMsg;
	

	public ErrorMessage(LocalDateTime date, String errorMsg) {
		super();
		this.date = date;
		this.errorMsg = errorMsg;
	}
	public ErrorMessage(LocalDateTime date, String errorMsg,String validationMsg) {
		super();
		this.date = date;
		this.errorMsg = errorMsg;
		this.validationMsg=validationMsg;
	}
	

	public String getValidationMsg() {
		return validationMsg;
	}
	public LocalDateTime getDate() {
		return date;
	}

	public String getErrorMsg() {
		return errorMsg;
	}
	

}
