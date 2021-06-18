package interfaceexamples;

public class ImplementClass implements TestEx{

	//override of default method
	public void defaultMethod()
	{
		System.out.println("default method of implementation class");
	}
	
//	public static void staticMEthod()
//	{
//		System.out.println("static method of implemetnation class");
//	}
	
	public  void test() {
		// TODO Auto-generated method stub
		System.out.println("test method");
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("demo method");
		
	}
	
	void method()
	{
		System.out.println("method");
	}

	
}
