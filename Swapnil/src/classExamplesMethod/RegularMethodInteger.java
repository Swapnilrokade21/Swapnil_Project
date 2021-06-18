package classExamplesMethod;

import java.util.Scanner;

public class RegularMethodInteger {
	static int demo(int p,int q)
	{
		int a = p;
		int b = q;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a = ");
		int n =sc.nextInt();
		System.out.println("Enter value of b = ");
		int m = sc.nextInt();
		x=demo(n,m);
		System.out.println("Addition is = "+x);
		
	}

}
