package classOOPS;

abstract class Bank
{
	abstract int getRateOfIntrest();
	
}
class SBI extends Bank
{

	@Override
	int getRateOfIntrest() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}
class Axis extends Bank
{
	int getRateOfIntrest()
	{
		return 8;
	}
}
public class AbstractBankExample {
	public static void main(String[] args) {
		
			Bank b;
			b = new SBI();
//			SBI b = new SBI();
			System.out.println("rate of intrest of SBI bank is = "+b.getRateOfIntrest());
			
			b =  new Axis();
//			Axis c= new Axis();
			System.out.println("rate of intrest of SBI bank is = "+b.getRateOfIntrest());
}
	
}
