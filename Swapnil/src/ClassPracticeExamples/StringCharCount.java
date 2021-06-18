package ClassPracticeExamples;

public class StringCharCount {

	public static void main(String[] args) {
		
		String str = "Swapnil Rokade";
		System.out.println(str);
	
		int count = 0;
	    for (int i=0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == 'a')
	        {
	             count++;
	        }
	    }
		System.out.println("occurrence of a: "+count);
	}
	
}
