package ExceptionHandling;

public class ExceptionTryCatch {
	
	static int a[] = {1,3,2,4,5};
	static int b = 0;
	static String s=null;

	public static void main(String[] args) {
		
		try 
		{	
			System.out.println(s.length()); // NUll point exception
			for(int i = 0;i<=5;i++)
			{
				System.out.println(a[i]); // ArrayOutOfBoundException
//				System.out.println(a[i]/b); //ArithmeticException
			}		

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("Hello");
	}

}
