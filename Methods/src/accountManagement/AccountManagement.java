package accountManagement;

public class AccountManagement {
	
	String name;
	int acNo,acBalance;
	
	void insertData(String name,int acNo,int acBalance)
	{
		this.name=name;
		this.acNo=acNo;
		this.acBalance=acBalance;
	}
	void displayData()
	{
		System.out.println("Name:"+name);
		System.out.println("Account No:"+acNo);
		System.out.println("Account balance:"+acBalance);
	}
	void dipositAmount(int amount)
	{
		acBalance=acBalance+amount;
	}
	void withdrawAmount(int amount)
	{
		acBalance=acBalance-amount;
	}
	void accountBalance()
	{
		System.out.println("Account Balance:"+acBalance);
	}

}
