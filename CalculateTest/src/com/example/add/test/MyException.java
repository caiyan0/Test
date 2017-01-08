package com.example.add.test;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7569872728785550957L;

	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable throwable) {
		super("发生自定义异常",throwable);
		// TODO Auto-generated constructor stub
	}
	
	

}
