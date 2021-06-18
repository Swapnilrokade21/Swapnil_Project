package typecasting;

class Super
{
	void test()
	{
		System.out.println("test method of superclass");
	}
	
	void demo()
	{
		System.out.println("demo method super class");
	}
}

class Subclass extends Super 
{
	void test()
	{
		System.out.println("test method of Subclass");
	}
	void xyz()
	{
		System.out.println("xyz methods of subclass");
	}
}

public class NonPrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super s1 = new Super();
		s1.test();
		s1.demo();
//		s1.xyz();
		System.out.println("--------------");
		
		Subclass s2 = new Subclass();
		s2.test();
		s2.demo();
		s2.xyz();

		System.out.println("--------------");
		
		Super s3 = new Subclass();
		s3.test();
		s3.demo();
//		s3.xyz();  
		System.out.println("--------------");
	}

}
