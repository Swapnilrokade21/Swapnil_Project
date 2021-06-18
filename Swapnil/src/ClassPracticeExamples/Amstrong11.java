package ClassPracticeExamples;

import java.util.Scanner;

public class Amstrong11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter 3 digit number=");
		
		int n= sc.nextInt();
//		int n = 153;
		
		int temp, rem,result;
		temp = n;
		result = 0;
		
		for(;n!=0;n=n/10)
		{
			rem = n % 10;
//			result = result + (rem*rem*rem*rem);  
			result = result + (rem*rem*rem); 
		}
		if(temp==result)
		{
			System.out.println(temp+" amstrong");
		}
		else
		{
			System.out.println(temp+" not amstrong");
		}
		
	}

}
