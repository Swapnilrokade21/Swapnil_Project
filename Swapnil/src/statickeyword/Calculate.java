package statickeyword;

/**
 * @author Mayank
 *
 */
/**
 * @author Mayank
 *
 */
public class Calculate {
	
	static int a = 40 ;
	static int cube(int x)
	{
		return x*x*x;
	}
	public static void main(String args[])
	{
		 int result;
		 result = Calculate.cube(10);
		 System.out.println(result);
		 System.out.println(a);
	}

//	static block
	static {
		System.out.println("static block is invoked method");
	}
}
