package polymorphism;


class Aaa
{
	Aaa()
	{
		System.out.println("parent class cunstroctor invoked");
	}
}
class B extends Aaa
{

	B()
	{
//		super();  
		System.out.println("Child class Cunstroctor is invoked");
	}
	
	{
		System.out.println("instance block invoked");
	}
}
public class InstanceBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new B();
	}

}
