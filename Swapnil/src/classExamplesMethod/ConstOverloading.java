package classExamplesMethod;

public class  ConstOverloading {
	int a;
	
	 ConstOverloading() 
	 {
		a=10;
	 }	
	 ConstOverloading(int b) 
	 {
		a=56;
	 }	
	 ConstOverloading(char c) 
	 {
		a=85;
	 }	
	 ConstOverloading(char c,int d) 
	 {
		a=85;
	 }	
	 ConstOverloading(int c,char d) 
	 {
		a=5;
	 }	
	 

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstOverloading z = new ConstOverloading('c',6);
		System.out.println("z.a= "+z.a);
		
		ConstOverloading x = new ConstOverloading(5,'k');
		System.out.println("x.a= "+x.a);
		
		ConstOverloading y = new ConstOverloading(458);
		System.out.println("y.a= "+y.a);
		System.out.println("------------------");
		
		x.a=50;
		System.out.println("x.a= "+x.a);
		System.out.println("y.a= "+y.a);

		y.a=45;
		System.out.println("x.a= "+x.a);
		System.out.println("y.a= "+y.a);
	}

}
