package forloopStarPattern;

public class StarPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		for(int i=1;i<=9;i++)
		{
			for(int k=9;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=x;j++)
			{
				System.out.print("*");	
			}
			x=x+2;
			System.out.println();
		}
	}

}
