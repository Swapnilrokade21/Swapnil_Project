package polymorphism;

class Bikesss
{
	void run()
	{
		System.out.println("Running");
	}
}
class Hondasss extends Bikesss
{
	void run()
	{
		System.out.println("honda bike is running");
	}
}
public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bikesss b1 = new Hondasss();
		b1.run();
		
		Bikesss b2 = new Bikesss();
		b2.run();
		
		Hondasss h1 = new Hondasss();
		h1.run();
		

	}

}
