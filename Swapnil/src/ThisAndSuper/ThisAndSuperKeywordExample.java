package ThisAndSuper;

public class ThisAndSuperKeywordExample extends Super {

	int a = 50;
	
	public void demo()
	{
		int a = 100;
		System.out.println("local variable = "+a);
		System.out.println("Global variable of same class ="+this.a);
		System.out.println("Global variable of Super Class ="+super.a);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisAndSuperKeywordExample obj = new ThisAndSuperKeywordExample();
		obj.demo();
	}

}
