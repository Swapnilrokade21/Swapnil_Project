package Swap;



class Stud1
{
	int rollno;
	String name;
	void insertRecord(int r,String n)
	{
		rollno = r;
		name = n;
	}
	void display()
	{
		System.out.println(rollno+"  "+name);
	}
	
}
public class StudentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud1 s1 = new Stud1();
		Stud1 s2 = new Stud1();
		Stud1 s3 = new Stud1();
		s1.insertRecord(1,"Swapnil Rokade");
		s2.insertRecord(2, "Surabhi Rokade");
		s3.insertRecord(3, "Shreyank Gore");
		s1.display();
		s2.display();
		s3.display();
	}

}
