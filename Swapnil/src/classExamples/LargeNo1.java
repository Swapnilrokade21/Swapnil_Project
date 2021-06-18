package classExamples;

public class LargeNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 111;	
		int b = 222;
		int c = 333;
		int d = 444;
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println(a);
				}
				else
				{
					System.out.println(d);
				}
			}
		}
		
		
		else if(b>c)
			{
				if(b>d)
				{
					System.out.println(b);	
				}
			    else
				{
					System.out.println(d);
		        }
			
			}
			
		else if(c>a)
			{
				if(c>d)
				{

						System.out.println(c);	
				}
					else
					{
					System.out.println(d);
					}
				}
	}

}
