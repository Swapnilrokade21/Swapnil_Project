package ExceptionHandling;

public class ThrowKeyword {
	
	static void student(int marks)
	{
		if(marks<35)
		throw new ArithmeticException("Not Pass");
		else
			System.out.println("Student Pass");
	}
	public static void main(String[] args) {
		student(95);
		student(34);
	
		
	}

}
