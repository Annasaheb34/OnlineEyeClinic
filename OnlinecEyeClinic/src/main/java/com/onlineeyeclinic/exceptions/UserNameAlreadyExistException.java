package com.onlineeyeclinic.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class UserNameAlreadyExistException extends Exception
{
	private static final long serialVersionUID = 1L;

	public UserNameAlreadyExistException(String message)
	{
		super(message);
	}
}