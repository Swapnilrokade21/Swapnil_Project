package polymorphism;

public class OverloadingTypePromotion {
	
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}
	void sum1(short a,short b)
	{
		System.out.println("short");
	}
	void sum1(int a, int b)
	{
		System.out.println("integer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingTypePromotion o1 = new OverloadingTypePromotion();
				o1.sum(5, 15);
				o1.sum(5,15,25);
				o1.sum1(0, 0);
				o1.sum1(10, 10);
			
//		OverloadingTypePromotion.sum(5,5);           // static keyword is use for this
	}

}
