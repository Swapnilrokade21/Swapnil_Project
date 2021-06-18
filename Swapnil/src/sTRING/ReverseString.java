package sTRING;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a, rev="";
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		a=s.nextLine();
		
//		s.close();
		
		int length=a.length();
		
		for(int i=length-1;i>=0;i--)
		{ 
			rev=rev+a.charAt(i);
		}
		
		System.out.println("Reversed string: "+rev);
		if(a.equals(rev))
		{
			System.out.println("string is palidrome");
		}
		else
		{
			System.out.println("String is not palidrome");
		}
		
	}

}
