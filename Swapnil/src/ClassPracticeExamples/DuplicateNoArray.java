package ClassPracticeExamples;

public class DuplicateNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {2,3,4,5,3,4,5,6,7,8,8};
		System.out.println("duplicate numbers from array");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
					System.out.print(a[i]+" ");
			}
		}
		
	}

}
