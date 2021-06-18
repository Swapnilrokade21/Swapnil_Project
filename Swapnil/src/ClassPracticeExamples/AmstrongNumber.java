package ClassPracticeExamples;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n,temp,c,a;
		n = 1634;
		temp = n;
		c=0;
		
//		while(n>0)
//		{
//		a = n % 10 ;
//		n = n/10;
//		c = c + (a*a*a*a); 		
//		}
		
	
		for(;n!=0;n = n/10)
		{
			a = n % 10 ;
			
			c = c + (a*a*a*a); 		
		}
			
		if(c == temp)
		{
			System.out.println(temp+" is amstrong number ");
		}
		else
		{
			System.out.println(temp+" is not amstrong number ");
		}
		
		
	}

}
