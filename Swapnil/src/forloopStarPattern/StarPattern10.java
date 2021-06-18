package forloopStarPattern;

public class StarPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		for(int i=1;i<=13;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=13;j>=x;j--)
			{
				System.out.print("*");
			}
			x=x+2;
			System.out.println();		
		}
	}

}
