package polymorphism;

class Bank111
{
	int getRateOfIntrest()
	{
		return 0;
	}
}
class Sbi1 extends Bank111
{
	int getRateOfIntrest()
	{
		return 8;
	}
}
class Axis1 extends Bank111
{
	int getRateOfIntrest()
	{
		return 9;
	}
}
class Icici1 extends Bank111
{
	int getRateOfIntrest()
	{
		return 7;
	}
}
public class BankPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank111 b1;
		b1 = new Sbi1();
		System.out.println("SBI Rate Of Intrest = "+b1.getRateOfIntrest());
		b1 = new Axis1();
		System.out.println("Axis Rate Of Intrest = "+b1.getRateOfIntrest());
		b1 = new Icici1();
		System.out.println("ICICI Rate Of Intrest = "+b1.getRateOfIntrest());
		
		
		
	}

}
