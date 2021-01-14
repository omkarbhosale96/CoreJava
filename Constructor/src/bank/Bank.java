package bank;

public class Bank {
	
	int amount=5000;
	
	int add;
	Bank(int add)
	{
		this.add=add;
		amount=amount+add;
		System.out.println("Total amount:"+amount);
	}
	 Bank()
	 {
		System.out.println("Amount:"+amount);
	 }

}
