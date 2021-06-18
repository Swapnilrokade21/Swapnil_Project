package sTRING;

public class StringExample {
	
	static String a = "Swapnil";
	static String b = "Swapnil";
	
	static String c = new String("Swapnil");
	static String d = new String("Swapnil");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println(b == c);
		System.out.println(b == d);
		System.out.println(c == d);
		
				
	}

}
