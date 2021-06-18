package interfaceexamples;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementClass c1 = new ImplementClass();
		c1.demo();
		c1.test();
		c1.method();
		c1.defaultMethod();
//		ImplementClass.staticMEthod();  can not call by implementation class
		TestEx.staticMethod();
		
		System.out.println(c1.a);
		System.out.println(TestEx.a);
		
		
		
	}

}
