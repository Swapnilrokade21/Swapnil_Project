package inheritance;

public class Emp {

	int id ;
	String name;
	Addresss address;   //Addresss.java 
	
	public Emp(int id,String name,Addresss address)
	{
		this.id =id;
		this.name = name;
		this.address = address;
	}
	
	void disp()
	{
		System.out.println(id+"    "+name);
		System.out.println(address.city+"     "+address.state+"    "+address.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addresss a1 = new Addresss("PUSAD","MH","INDIA");
		Addresss a2 = new Addresss("Banglore","KA","INDIA");
		
		Emp e1 =new Emp(1,"SWAPNIL",a1);
		Emp e2 = new Emp(2,"SURABHI", a2);
		e1.disp();
     	e2.disp();
	}

}
