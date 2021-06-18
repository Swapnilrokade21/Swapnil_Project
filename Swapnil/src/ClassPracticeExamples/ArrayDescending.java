package ClassPracticeExamples;

public class ArrayDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {2,11,23,11,23,23,44,55,11,2,3,4,5};
		int temp;
		
		System.out.println("Descending Array");
		for(int i=0; i < a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i]+" ");
		}

	}

}
