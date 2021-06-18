package classExamples;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a [] = {'I',' ','L','O','V','E',' ','I','N','D','I','A'};
		
		System.out.println(a.length);

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("_____________________");
		
		int d[] = new int[4];
	
		System.out.println(d[2]);
		System.out.println("_____________________");
		
		for(int i=0;i<d.length;i++)
		{
			d[i]=i;
			System.out.println(d[i]);
		}
		
		System.out.println("_____________________");
		for(int i =(d.length-1);i>=0;i--)
		{
			System.out.println(d[i]);
		}
		System.out.println("_____________________");
		int b[]=new int [4];
		b[0] = 45;
		b[1] = 145;
		b[2] = 245;
		b[3] = 175;
				
		for(int i=0;i<b.length;i++)
		{
		System.out.println(b[i]);
		}
		System.out.println("_____________________");
		for(int i = (b.length-1);i>=0;i--)
		{
			System.out.println(b[i]);
		}
		
		
	}	

}
