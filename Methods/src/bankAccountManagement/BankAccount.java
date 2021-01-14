package bankAccountManagement;

public class BankAccount {
	
	String name;
	int acNo,balance;
	void getData(String a,int b,int c)
	{
		name=a;
		acNo=b;
		balance=c;
		
	}
	void print()
	{
		System.out.println("Name:"+name);
		System.out.println("Account No:"+acNo);
		System.out.println("Account balance:"+balance);
	}

}
