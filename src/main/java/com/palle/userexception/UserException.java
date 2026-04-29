package com.palle.userexception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserException {
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String, String> exceptionHandling(MethodArgumentNotValidException ex) {
		Map<String, String> map = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(err->map.put(err.getField(), err.getDefaultMessage()));
		
		return map;
	}
}
