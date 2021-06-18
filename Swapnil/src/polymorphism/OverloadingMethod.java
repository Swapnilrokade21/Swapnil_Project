package polymorphism;


class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)    //method overloading changing number of arguments
	{
		return a+b+c;
	}
	static double add(double a,double b)  // method overloading changing data types of argument
	{
		return a+b;
	}
	static void main()
	{
		System.out.println("another main method");
	}
}

public class OverloadingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(5,5));
		System.out.println(Adder.add(5,5,5));
		System.out.println(Adder.add(5.5,5.5));
		Adder.main();

	}

}
