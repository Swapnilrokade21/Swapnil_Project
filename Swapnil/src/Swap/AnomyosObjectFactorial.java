package Swap;

class Calculation
{
void fact(int n)
{
	int fact = 1;
	for(int i=1;i<=n;i++)
	{
		fact = fact*i;
	}
	System.out.println("the Factorial is = "+fact);
}
}

public class AnomyosObjectFactorial {
public static void main(String args[]) 
{
	new Calculation().fact(5);
	new Calculation().fact(4);
	new Calculation().fact(3);
	new Calculation().fact(2);
	new Calculation().fact(1);
	new Calculation().fact(6);
	new Calculation().fact(7);
}
}
