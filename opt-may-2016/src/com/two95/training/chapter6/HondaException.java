package com.two95.training.chapter6;

public class HondaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public HondaException()
	{
	}

	public HondaException(String message)
	{
		super(message);
	}

	public HondaException(Throwable cause)
	{
		super(cause);
	}

	public HondaException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
