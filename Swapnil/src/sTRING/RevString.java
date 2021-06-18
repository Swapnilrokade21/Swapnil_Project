package sTRING;

import java.util.Scanner;

public class RevString {
	
public static void main(String[] args) {
	
	String a;
	String rev = " ";
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the string to reverse");
	a=s.nextLine();
	
	int x=a.length()-1;
	System.out.println(x);
	
	String temp = a;

	for(int i= 0;i<a.length();i++)
	{
			for(int j = x ;j>=0;j--)
		{
			rev =	 temp.replace(a.charAt(i),a.charAt(j));
			
		}	

	}	
	System.out.println(rev);
	
}

}
//Wrong Logic 