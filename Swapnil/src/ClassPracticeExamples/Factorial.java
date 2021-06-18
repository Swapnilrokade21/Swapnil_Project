package ClassPracticeExamples;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long
		int i,fact=1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n = ");
		int n =sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of "+n+" is = "+fact);
	}

}
