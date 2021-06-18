package ClassPracticeExamples;

import java.util.Scanner;

public class PalidromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
//		int n = 454;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n = ");
		int n = sc.nextInt();
		
		int temp,r,sum=0;
		
		temp = n;
		while(n>0)
		{
			r = n % 10;
			sum = (sum*10)+r;
			n = n/10;
		}
		
		if(temp==sum)
		{
			System.out.println(temp+"= is a palidrome number");
		}
		else
		{
			System.out.println(temp+"= is a not palidrome number");
		}

	}

}
