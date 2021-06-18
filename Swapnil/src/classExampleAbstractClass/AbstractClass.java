package classExampleAbstractClass;

  abstract class Ac{

	void test(int a)
	{
	 
	}
     abstract void demo();
	abstract void demo2();
}
 
 abstract class Ac2 extends Ac
 {

	   void demo()
		{
			System.out.println("xyz");
		}
	   abstract void abc();
 }
 
 class Ac3 extends Ac2
 {

	@Override
	void abc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void demo2() {
		// TODO Auto-generated method stub
		
	}
	   
 }
 
public  class AbstractClass  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

}
