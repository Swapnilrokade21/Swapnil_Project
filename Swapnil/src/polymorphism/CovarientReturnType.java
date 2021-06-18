package polymorphism;

class A
{
	A get()
	{
		return this;
	}
}
public class CovarientReturnType extends A{
	
	CovarientReturnType get()
	{
		return this;
	}
	void message()
	{
		System.out.println("Welcome to Covarient Return Type");
	}
	public static void main(String args[])
	{
		
		new CovarientReturnType().get().message();
	}

}
