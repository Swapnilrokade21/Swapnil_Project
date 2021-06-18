package Swap;

class Account
{
	int acc_no;
	String name;
	float amount;
	
	void insert(int acc,String n,float amt)
	{
		acc_no=acc;
		name=n;
		amount=amt;		
	}
	void deposite(float amt)
	{
		amount = amount + amt;
		System.out.println(amt+" deposited");
	}
	void withdraw(float amt)
	{
		if(amount<amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			amount = amount-amt;
			System.out.println(amt+" Withdrawn");
		}
	}
	
	void checkBalance()
	{
		System.out.println("Balance is = "+amount);
	}
	void display()
	{
		System.out.println(acc_no+"  "+name+"  "+amount);
	}
	
	
}
public class WorkingOfBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1= new Account();
		a1.insert(101201, "swapnil", 120000);
		a1.display();
		a1.checkBalance();
		a1.deposite(10000);
		a1.withdraw(150000);
		a1.checkBalance();
		a1.withdraw(1000);
		a1.checkBalance();
		a1.display();
	}

}
