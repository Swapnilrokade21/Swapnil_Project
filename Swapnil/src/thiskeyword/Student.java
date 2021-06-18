package thiskeyword;

public class Student {

	int id;
	String name,course;
	double fee;
	
	public Student(int id,String name,String course) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.course =course;
	
	}
	Student(int id,String name,String course,double fee)
	{
		this(id,name,course);
		this.fee = fee;
	}
	void disp()
	{
		System.out.println(id+"  "+name+"  "+course+"   "+fee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Swapnil","java",10000);
		Student s2 = new Student(2,"Surabhi","C++"); 
		s1.disp();
		s2.disp();
	}

}
