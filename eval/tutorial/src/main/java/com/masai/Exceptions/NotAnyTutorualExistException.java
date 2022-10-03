package com.masai.Exceptions;

public class NotAnyTutorualExistException extends RuntimeException {
    public NotAnyTutorualExistException() {
    
    }
    
    public NotAnyTutorualExistException(String message) {
    	super(message);
    }
}
