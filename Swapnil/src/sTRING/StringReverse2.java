package sTRING;

import java.util.Scanner;

public class StringReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter String");
	
		String a = s.nextLine();
		s.close(); 
		
		for(int j = a.length()-1;j>=0;j--)
		{
			System.out.print(a.charAt(j));
		}
			
	}

}
