package aPack1;

public class Class1 {
	
	public static int a =10;
	public int b = 20;
		static int c = 30;    //default
		private static int d = 40; 
		protected static int e = 100;
		
		static  void demo()            // access specifier default
		{
			System.out.println("Demo default Method from Class 1");
		}
		
		public static void disp()
		{
			System.out.println("Disp public method from class 1");
		}
		
		private static void display()
		{
			System.out.println("display private method from class 1");
		}
		
		protected static void demo2()
		{
			System.out.println("demo2 protected method from class 1");
		}
		
		public Class1()
		{
			
		}
		 Class1(char b)
		{
			
		}
		public Class1(int a)
		{
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		
//		System.out.println(b);   not printed as it is not static
		Class1 x =new Class1();
		System.out.println(x.b);
		demo();
		disp();
		display();
		demo2();
		
		
	}

}
