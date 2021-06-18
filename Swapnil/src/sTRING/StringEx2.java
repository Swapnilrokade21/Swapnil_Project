package sTRING;

public class StringEx2 {
	
	static String a = "Swapnil";
	static String b = "Swapnil";
	
	static String c = new String("Swapnil");
	static String d = new String("Swapnil");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a+" "+b+" "+c+" "+d);
		
		System.out.println(a==b);
		b = "class";
		System.out.println(a==b);
		
	}

}
