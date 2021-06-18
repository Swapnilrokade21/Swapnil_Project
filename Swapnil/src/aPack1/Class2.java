package aPack1;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Class1.a);
		
		Class1 x = new Class1();    
		System.out.println(x.b);
		
		System.out.println(Class1.c);      // default if same package then it is called....
		
//		System.out.println(Class1.d);     // cannot call as it from same package but d is private in class1
	
//		System.out.println(Class1.e);        // protected can call in same package .
		
		Class1.demo();                   // default method call from another class from same package.
		
		Class1.disp();
		
//		Class1.display();    not call as it is private.
		
		
		Class1.demo2();
	}

}
