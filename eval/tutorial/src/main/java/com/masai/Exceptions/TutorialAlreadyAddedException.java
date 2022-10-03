package com.masai.Exceptions;

public class TutorialAlreadyAddedException extends RuntimeException {
	public TutorialAlreadyAddedException() {
	}
 
	public TutorialAlreadyAddedException(String message) {
		super(message);
	}
}
