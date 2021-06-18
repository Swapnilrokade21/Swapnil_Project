package ClassPracticeExamples;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		System.out.println("Even number  array is ");
		for(int i = 0;i<=a.length-1;i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.print(a[i]+" ");
			}			
		}
		System.out.println();
		System.out.println("Odd number array is ");
		for(int i = 0;i<=a.length-1;i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i]+" ");
			}			
		}
	}

}
