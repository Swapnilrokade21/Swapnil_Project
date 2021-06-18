package inheritance;


class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking");
	}
}

public class SingleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Dog a1 = new Dog();
	a1.eat();
	a1.bark();
	

	}

}
