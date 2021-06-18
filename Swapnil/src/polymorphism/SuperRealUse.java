package polymorphism;

class Person
{

	int id;
	String name;
	public Person(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}

class Employee extends Person
{
	float salary;
	public Employee(int id,String name,float salary)
	{
      super(id,name);
		this.salary = salary;
	}
	void disp()
	{
		System.out.println(id+"   "+name+"   "+salary);
	}
}

public class SuperRealUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Swapnil",50500.515f);
		e1.disp();
	}

}
