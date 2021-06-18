package ClassPracticeExamples;

public class DuplicateStringFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] array = {"swap","mahi","ma","mswaads","mahi","swap","swapnil","Swapnil"};
		
		for(int i = 0; i<array.length-1;i++)
		{
			for(int j = i+1;j<array.length;j++)
			{
				if(array[i].equalsIgnoreCase(array[j]) && (i != j) )
//				if(array[i].equals(array[j]) && (i != j) )
				{
					System.out.println("DuplicateString ="+array[j]);		
				}
				
			}
		}
	}

}
