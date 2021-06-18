package ClassPracticeExamples;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {2,11,23,11,23,23,44,55,11,2,3,4,5};
		
		System.out.println("reverse array is");
		for(int i = (a.length-1); i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
