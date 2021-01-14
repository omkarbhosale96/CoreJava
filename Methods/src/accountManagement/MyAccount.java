package accountManagement;

public class MyAccount {

	public static void main(String[] args) {
		AccountManagement ac=new AccountManagement();
		
		ac.insertData("Thor", 416118, 2000);
		ac.displayData();
		ac.dipositAmount(2000);
		ac.accountBalance();
		ac.withdrawAmount(3000);
		ac.accountBalance();

	}

}
