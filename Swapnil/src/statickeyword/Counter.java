package statickeyword;

public class Counter {

	static int count = 0;
	int count1 = 0;
	
	public Counter() {
		// TODO Auto-generated constructor stub
		count++;
		count1++;
		System.out.println(count+"     "+count1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
	}

}
