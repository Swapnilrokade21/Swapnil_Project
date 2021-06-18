package polymorphism;


class Animal
{
	String color = "White";
}
class Dog extends Animal
{
	String color = "Black";
	 void disp()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class Superkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.disp();
	}

}
