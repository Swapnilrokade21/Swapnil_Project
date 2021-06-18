package thiskeyword;

public class Thiskey {

	int id;
	String name;
	double fee;
	
	public Thiskey(int id, String name,double fee) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	
	void disp()
	{
		System.out.println(id+"  "+name+"  "+fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thiskey t1 = new Thiskey(1,"Swapnil",10000);
		Thiskey t2 = new Thiskey(2,"Surabhi",10000.55);
		t1.disp();
		t2.disp();
	}

}
