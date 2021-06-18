package inheritance;

class Programmer
{
	int bonus = 10000;
}

public class Employee extends Programmer{
	
	float salary = 50000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		System.out.println("salary is: "+e1.salary);
		System.out.println("bonus is: "+e1.bonus);
	}

}
