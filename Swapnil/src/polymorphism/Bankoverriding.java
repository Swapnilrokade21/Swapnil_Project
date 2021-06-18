package polymorphism;


class Bank
{
	   int getRateOfIntrest()
	{
		return 0;
	}
}

class Sbi extends Bank
{
	 int getRateOfIntrest()
	{
		return 7;
	}
}

class Axis extends Bank
{
	int getRateOfIntrest()
	{
		return 9;
	}
}
class Icici extends Bank
{
 int getRateOfIntrest()
	{
		return 8;
	}
}

public class Bankoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi s1 = new Sbi();
		Axis a1 = new Axis();
		Icici i1 = new Icici();
		
		System.out.println("SBI Rate of Intrest = "+s1.getRateOfIntrest());

		System.out.println("AXIS Rate of Intrest = "+a1.getRateOfIntrest());
		
		System.out.println("ICICI Rate of Intrest = "+i1.getRateOfIntrest());

		
	}

}
