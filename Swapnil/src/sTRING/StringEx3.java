package sTRING;

public class StringEx3 {
	static String a = "Swapnil";
	static String b = "Swapnil";
	static String a1 = "swapnil";
	
	static String c = new String("Swapnil");
	static String d = new String("Swapnils");
	static String c1 = new String("swap");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    boolean x = a.equals(b);
		System.out.println(x);
		System.out.println(a.equals(a1));
		System.out.println(a.equalsIgnoreCase(a1));
		
		String y = a.concat(" "+c1);
		System.out.println(y);
		
		String z = a.toUpperCase();
		System.out.println(z);
		String z1 = a.toLowerCase();
		System.out.println(z1);
		
		System.out.println(c.startsWith("s"));
		System.out.println(c.startsWith("S"));
		System.out.println(c.endsWith("l"));
		System.out.println(c1.indexOf("p"));
		System.out.println(d.lastIndexOf("s"));
		System.out.println(c1.length()+" "+d.length());
			
		a = "    Swapnil     Rokade    ";
		System.out.println(a);
		System.out.println(a.trim()); // remove space start and end
		
		b = "Swapnil Surabhi";
		System.out.println(b.replace('S', 'c'));
		System.out.println(b.replace("nil", "bhi"));
	
	}

}
