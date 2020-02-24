package com.Exception;

public class Customexception {
	
	static void validate(int age)
	{
	try
	{
		if(age<18)
		{
			throw new Exception("not valid");
		}
			else
			{
				System.out.println("valid");
			}
			 
		
	}
 catch(Exception e)
	{
	 System.out.println(e);
	}
}

	public static void main(String[] args) {
		validate(13);
		
		

		
		
		
	}

}
