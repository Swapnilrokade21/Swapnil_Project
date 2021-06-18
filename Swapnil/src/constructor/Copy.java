package constructor;


//there is no copy constructor in java ... but we can copy by object
public class Copy {

	int id;
	String name;
	
	 Copy(int i,String n) {
		// TODO Auto-generated constructor stub
		 id = i;
		 name = n;
		
	}

	 Copy(Copy c)
	 {
		 id = c.id;
		 name = c.name;
	 }
	 
	 void disp()
	 {
		 System.out.println(id+"   "+name);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Copy c1 = new Copy(1,"swap");
		Copy c2 = new Copy(c1);
		c1.disp();
		c2.disp();
	}
	
}
