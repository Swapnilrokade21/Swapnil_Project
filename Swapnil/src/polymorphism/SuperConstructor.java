package polymorphism;



class Animal1
{
	Animal1()
	{
		System.out.println("Animal is created");
	}
}

class Dog1 extends Animal1
{	
	Dog1()
	{
		super();
		System.out.println("Dog is created");
	}
	
}
public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Dog1();
		
		

	}

}
