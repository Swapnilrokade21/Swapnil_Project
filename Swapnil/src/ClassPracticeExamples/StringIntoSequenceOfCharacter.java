package ClassPracticeExamples;

import java.util.Scanner;

public class StringIntoSequenceOfCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
//		String s = "Swapnil";
		
		for(int i=0;i<s.length();i++)
		{
			char c =  s.charAt(i);
			System.out.println("Char present "+i+" location "+c);
		}
	}
}
