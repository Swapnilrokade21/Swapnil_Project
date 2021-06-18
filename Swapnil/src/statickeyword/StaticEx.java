package statickeyword;

public class StaticEx {
	
	int id;
	String name;
	static String collegeName = "BNCOE";
	
	static void change()
	{
		collegeName = "COEP PUNE";
	}

	public StaticEx(int i,String n) {
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}
	void disp()
{
		System.out.println(id+"  "+name+"   "+collegeName);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx.change();   
		StaticEx s1 = new StaticEx(1,"swapnil");
		StaticEx s2 = new StaticEx(2,"surabhi");
		StaticEx s3 = new StaticEx(3,"shreyank");
		s1.disp();
		s2.disp();
		s3.disp();

	}

}
