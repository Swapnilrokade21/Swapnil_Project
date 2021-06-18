package inheritance;

class Operation
{
	int sqare(int n)
	{
		return n*n;
		
	}
}

class Circle
{
	Operation op ;   //aggregation
	double pi = 3.14;
	
	double area(int radius)
	{
		op = new Operation();
		int squares = op.sqare(radius);
		return pi*squares;
		
	}
}

public class Aggreagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle();
		double result=c1.area(2);
		System.out.println(result);
	}

}
