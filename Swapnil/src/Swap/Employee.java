package Swap;

class Emp
{
	int id;
	String name;
	float salary;
	
	void insert(int i,String n,float s)
	{
		id = i;
		name = n;
		salary = s;
	}
	
	void display()
	{
		System.out.println(id+"  "+name+"  "+salary);
	} 
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		e1.insert(101010, "Swapnil", 600000);
		e2.insert(101011, "Surabhi",599990);
		e3.insert(101012, "Shreyank", 1000000);
		
	
		e1.display();
		e2.display();
		e3.display();
//		e2.display();
	
		
	}

}
