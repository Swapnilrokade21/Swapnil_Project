package ClassPracticeExamples;

import java.util.Scanner;

public class ReverseEachWordAtSamePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
//		String s = "Swapnil Rokade";
		
		String[] words = s.split(" ");
		String revString= "";
		for(int i = 0; i <words.length;i++)
		{
			String word = words[i];
			String revWord = "";
			for(int j = word.length()-1;j >= 0;j--)
			{
				revWord = revWord + word.charAt(j);
			}
			revString = revString + revWord + " ";
		}
		System.out.println("given String is =      "+s);
		System.out.println("result string is=      "+revString);

	}

}

