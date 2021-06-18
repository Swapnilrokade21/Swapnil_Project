package typecasting;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Impplicit Casting");
		int x =10;
		double y =x;        
		System.out.println(y);
		System.out.println("----------------");

		System.out.println("Explicit Casting");
		double a = 20.9;
		int b = (int) a;
		System.out.println(b);
		System.out.println("----------------");
		
		
		short q = 200;
		byte p = (byte) q;
		System.out.println(p);
		System.out.println("----------------");

		byte r = 127;
		short s = r;
		System.out.println(s);
		
		
		
	}

}
