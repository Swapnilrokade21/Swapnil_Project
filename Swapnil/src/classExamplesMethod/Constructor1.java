package classExamplesMethod;

public class Constructor1 {
	
	int a;
	
	Constructor1()
	{
		a=10;
	}
	
	 public static void swap()
	 {
		System.out.println("sswap"); 
	 }
	
	Constructor1(int c)
	{
		a=c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 c1= new Constructor1();
		System.out.println(c1.a);
		Constructor1 c2=new Constructor1(15);
		System.out.println(c2.a);
		c2.a++;
		System.out.println(c2.a);
	}
}
