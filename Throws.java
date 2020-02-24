package com.Exception;

public class Throws {

	
	static void throwmethod()throws ArithmeticException
	{
		int a=2/0;
		
	}
	public static void main(String[] args) 
	{
		try
		{
			throwmethod();
			
		}
	
		catch(Exception ne)
		{
			System.out.println(ne);
		}
	}

}
