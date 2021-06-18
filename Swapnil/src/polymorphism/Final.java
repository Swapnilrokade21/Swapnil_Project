package polymorphism;


// final class Bike11    // if final we cannot extend this class
 class Bike11
{
//	final
	int speedlimit = 90;
	
	
//	final void run()
	void run()
	{
		speedlimit = 100;
		System.out.println(speedlimit);
		System.out.println("running");
	}
	void run1()
	{
		speedlimit = 100;
		System.out.println(speedlimit);
		System.out.println("running");
	}
}
class Honda extends Bike11
{
	void run()
	{
		System.out.println("honda Running");
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h1 = new Honda();
		h1.run();
		h1.run1();

	}

}
