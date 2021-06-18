package constructor;

public class ParamConst {
	int id;
	String name;

	public ParamConst(int i,String n) {
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
		
	}
	void disp()
	{
		System.out.println(id+"   "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamConst p1 = new ParamConst(11,"swap");
		ParamConst p2 = new ParamConst(12,"surabhi");
		p1.disp();
		p2.disp();
		
	}

}
