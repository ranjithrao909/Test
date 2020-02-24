package com.Exception;

public class Final {

	public static void main(String[] args) {
		try
		{
			int a=2/0;
		}
        catch(ArithmeticException ae)
		{
        	System.out.println(ae);
		}
		finally
		{
			System.out.println("Executed");
		}
	}
	

}
