package com.crud.exception;



import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus
public class ResourseNotFoundException extends RuntimeException{
	
	
	
	private static final long serialVersionUID = 1L;

	public ResourseNotFoundException(String msg) {
		super(msg);
	}
	
	public ResourseNotFoundException(String msg,Throwable throwable) {
		super(msg,throwable);
	}

}
