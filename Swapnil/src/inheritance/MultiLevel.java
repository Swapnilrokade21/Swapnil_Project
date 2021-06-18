package inheritance;

class Animal1
{
	void eat()
	{
		System.out.println("eating....");
	}
}

class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("barking....");
	}
}
class BabyDog extends Dog1
{
	void weep()
	{
		System.out.println("weeping....");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BabyDog b1 = new BabyDog();
		b1.bark();
		b1.eat();
		b1.weep();

	}

}
