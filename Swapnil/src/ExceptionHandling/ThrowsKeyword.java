package ExceptionHandling;

import java.io.IOException;

public class ThrowsKeyword {
	
	 void method() throws IOException
	 	{  
		  throw new IOException("device error");  
		}  
	public static void main(String[] args) throws IOException {
		try
		{
			ThrowsKeyword m=new ThrowsKeyword();  
		     m.method();  
		}
		catch(IOException e)
		{
			System.out.println(e);    // which Exception
		    System.out.println("normal flow..."); 	
		}
		
	   
	  }  
}
