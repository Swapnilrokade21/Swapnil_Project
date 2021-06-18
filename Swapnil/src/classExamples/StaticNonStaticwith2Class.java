package classExamples;

class Demo
{
	int a = 10;                 //Global variable and non static
	static int b = 20;			//Global variable and static
}
public class StaticNonStaticwith2Class {

	int c = 30;                  //Global variable and non static
	static int d=30;			//Global variable and static

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z = 190;             //Local variable
		Demo d1 = new Demo();
		System.out.println(d1.a);
		System.out.println(Demo.b);
		StaticNonStaticwith2Class s1 = new StaticNonStaticwith2Class();
		System.out.println(s1.c);
		
		System.out.println(d);
		System.out.println(z);

	}

}
