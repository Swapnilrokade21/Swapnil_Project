package polymorphism;

class Vehicle
{
	void run()
	{
		System.out.println("Vehical is Running");
	}
}
public class OverRiding extends Vehicle {

	void run()
	{
		System.out.println("Bike is Running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiding o1 = new OverRiding();
		o1.run();
		o1.run();

	}

}
