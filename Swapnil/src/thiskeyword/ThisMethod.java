package thiskeyword;

public class ThisMethod {
	
	void m()
	{
		System.out.println("hello m");
	}
	void n()
	{
		System.out.println("hello n");
		this.m();
//		m();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethod t1 = new ThisMethod();
		t1.n();
	}

}
