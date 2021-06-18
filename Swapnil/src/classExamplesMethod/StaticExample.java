package classExamplesMethod;

public class StaticExample {
	
	int a=10;
	int c=100;
	static int b = 15;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticExample s1 = new StaticExample();
		StaticExample s2 = new StaticExample();
		System.out.println(s1.a);
		s1.a++;
		System.out.println(s1.a);
		System.out.println(s1.c);
		
		b++;
		System.out.println(b);
		s1.b++;
		System.out.println(b);
		System.out.println("_________________");
		System.out.println(s2.a);

		System.out.println(s2.b);
		s2.a--;
		System.out.println(s2.a);
		System.out.println(s1.a);
		System.out.println(s2.b);
		System.out.println(s1.b);
	}

}
