package ClassPracticeExamples;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {2,11,23,11,23,23,44,55,11,2,3,4,5};
		int temp;
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length;j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		
		}
		System.out.println("Sorted Array");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println();
		System.out.println("largest number is = "+a[a.length-1]);
		System.out.println("smallest number = "+a[0]);
	}
}
