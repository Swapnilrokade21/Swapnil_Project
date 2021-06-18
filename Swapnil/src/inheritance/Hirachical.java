package inheritance;

class Animal2
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("barking...");
	}
}

class Cat extends Animal2
{
	void meow()
	{
		System.out.println("meowing...");
	}
}
public class Hirachical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat();
		Dog2 d2 = new Dog2();
		c1.eat();
		c1.meow();
//		c1.bark();    Error 
		d2.bark();
		d2.eat();
	
 		
	}

}
