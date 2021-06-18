package classExamples;

public class LargeNo {
	public static void main(String args[])
	{
		int a = 16;
		int b = 117;
		int c = 18;
		int d = 220;
		
		if(a>b&&a>c&&a>d)
		{
			System.out.println("Larger number is = "+a);
		}
		else if(b>a&&b>c&&b>d)
		{
			System.out.println("Larger number is = "+b);
		}
		else if(c>a&&c>b&&c>d)
		{
			System.out.println("Larger number is = "+c);
		}
		else 
		{
			System.out.println("Larger number is = "+d);
		}
		
	}

}
