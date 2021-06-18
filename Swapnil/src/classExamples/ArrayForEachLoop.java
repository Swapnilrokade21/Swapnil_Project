package classExamples;

public class ArrayForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = {12,18,15,16,13,11};
		System.out.println("___FOR EACH LOOP___");
		for(int i:b)
		{
			System.out.println(i);
		}

		System.out.println("_____Odd numbers from array_______");
		
		for(int i = 0; i<b.length ; i++)
		{
			if(b[i]%2 !=0)
			{
				System.out.println(b[i]);
			}
		}
System.out.println("_____Even numbers from array_______");
		
		for(int i = 0; i<b.length ; i++)
		{
			if(b[i]%2 ==0)
			{
				System.out.println(b[i]);
			}
		}
	}

}
