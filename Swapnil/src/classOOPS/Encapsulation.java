package classOOPS;

 class ClassA{
	private int a;
	private static int b;
	
	public void data(int i)
	{
		a = i;
	}
	 public int read()
	 {
		 return a;
	 }
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA x = new ClassA();
		
		x.data(5);
		int d = x.read();
		System.out.println(d);
		//  or 
		System.out.println(x.read());
	}

}
