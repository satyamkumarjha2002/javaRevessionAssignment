package com.masai.Exceptions;

public class TutorialWithThisIdNotExistException  extends RuntimeException{
	public TutorialWithThisIdNotExistException() {
	}

	public TutorialWithThisIdNotExistException(String message) {
    	  super(message);
      }
}
