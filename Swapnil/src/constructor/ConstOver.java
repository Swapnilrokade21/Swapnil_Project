package constructor;

public class ConstOver {

	int id;
	String  name;
	int age;
	
	 ConstOver(int i,String n) {
		// TODO Auto-generated constructor stub
		 id = i;
		 name = n;
		 System.out.println(id+"  "+name);
	}
	 ConstOver(int i,String n,int a)
	 {
		 id = i;
		 name = n;
		 age = a;
		 System.out.println(id+"  "+name+"  "+age);
	 }
//	  void disp()
//	 {
//		 System.out.println(id+"  "+name+"  "+age);
//	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConstOver c1 = new ConstOver(11,"swapnil");
//		ConstOver c2 = new ConstOver(12,"surabhi",25);
		
		new ConstOver(11,"swapnil");
		new ConstOver(12,"surabhi",25);
		
		
	
		classExamplesMethod.Constructor1.swap();   //call from another package
//		c1.disp();
//		c2.disp();
	}

}
