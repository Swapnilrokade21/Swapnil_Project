package aPack2;

import aPack1.Class1;

public class Class3 // extends Class1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Class1.a);   // public and static then call in another package also
		
		
		Class1 x = new Class1();
		Class1 x1 = new Class1('c');
		System.out.println(x.b);       // public and non static is call in another package also
	
//		System.out.println(Class1.c);  // default specifier not call in another package.
//		System.out.println(Class1.e);   //   protected can call by using inheritance i.e extends keyword use in class declaration
		
//		Class1.demo();     // Not call in another package as it is default access specifier.
		Class1.disp();     // call in another package as it is public method
		
//		Class1.demo2();         //  protected can call by using inheritance i.e extends keyword use in class declaration
		
		
		
	}

}
