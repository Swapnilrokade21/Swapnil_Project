package polymorphism;

class Animals
{
	void eat()
	{
		System.out.println("eating from parent class");
	}
}

class Dogs extends Animals
{
	void eat()
	{
		System.out.println("eating from subclassss");
		
	}
	void bark()
	{
		System.out.println("barking.....");
	
	}
	void disp()
	{
		eat();
		bark();
		super.eat();
	}
	
	
}
public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d1 = new Dogs();
		d1.disp();
	}

}
