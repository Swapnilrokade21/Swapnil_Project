package Swap;



class Stud
{
	int id;
	String name;
}
public class Student {
public static void main(String args[])
{
	Stud s1 = new Stud();
	Stud s2 = new Stud();
	s1.id = 10;
	s1.name = "Swapnil";
	s2.id = 9;
	s2.name = "Surabhi";
	System.out.println(s2.id+"   "+s2.name);
	System.out.print(s1.id+"  ");
	System.out.println(s1.name);
}
}
