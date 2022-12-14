package com.APIAssignment.userException;



import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomizedException extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex,WebRequest request,LocalDateTime timestamp){
		ExceptionResponse response = new ExceptionResponse(LocalDateTime.now(),
				ex.getMessage(),request.getDescription(false));
		return new ResponseEntity(response,HttpStatus.NOT_FOUND);
	}
}
