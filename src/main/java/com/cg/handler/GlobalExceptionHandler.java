package com.cg.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.exception.ImageNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
		
	@ExceptionHandler(ImageNotFoundException.class)
	public String hadleImageNotFoundException(ImageNotFoundException infe) {
		return infe.getMessage();
	}
}
