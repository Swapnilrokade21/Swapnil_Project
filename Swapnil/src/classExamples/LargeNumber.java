package classExamples;

public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 16;
		int b = 17;
		int c = 8;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Larger number is = "+a);
			}
			else
			{
				System.out.println("Larger number is = "+c);
			}
		}
		else if(b>c)
		{
			System.out.println("Larger number is = "+b);
		}
		else 
		{
			System.out.println("Larger number is = "+c);
		}

	}

}
