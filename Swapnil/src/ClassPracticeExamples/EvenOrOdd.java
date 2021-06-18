package ClassPracticeExamples;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		System.out.println("enter second number");
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		
		
		if(n % 2 == 0 )	
		{
			System.out.println(n+" is even number");
		}
		else
		{
			System.out.println(n+" is odd number");
		}

		if(n1 % 2 == 0 )	
		{
			System.out.println(n+" is even number");
		}
		else
		{
			System.out.println(n+" is odd number");
		}
		
	}

}
