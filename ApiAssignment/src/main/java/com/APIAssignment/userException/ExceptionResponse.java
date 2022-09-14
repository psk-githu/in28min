package com.APIAssignment.userException;


import java.time.LocalDateTime;

public class ExceptionResponse {
	
	private LocalDateTime timastamp;
	private String message;
	private String details;
	public ExceptionResponse(LocalDateTime timastamp, String message, String details) {
		
		this.timastamp = timastamp;
		this.message = message;
		this.details = details;
	}
	public ExceptionResponse() {
		
	}
	public LocalDateTime getTimastamp() {
		return timastamp;
	}
	
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	
	@Override
	public String toString() {
		return "ExceptionResponse [timastamp=" + timastamp + ", message=" + message + ", details=" + details + "]";
	}
	
	
	
	
}
