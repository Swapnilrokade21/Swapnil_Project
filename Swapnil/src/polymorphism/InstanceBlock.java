package polymorphism;

class Bike
{
	int speed;
	
	Bike()
	{
		
		System.out.println("speed is = "+speed);
	}
	{	
	speed = 100;
	}
  {
    	System.out.println("instance initializer block invoked");
   }  
}
public class InstanceBlock {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		new Bike();
	}

}
