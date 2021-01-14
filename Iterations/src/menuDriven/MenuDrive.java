package menuDriven;

import java.util.Scanner;

public class MenuDrive {
	OperationsNum op=new OperationsNum();
	void getMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Prime numbers, 2:Even numbers, 3:Odd numbers");
		System.out.println("Enter option");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1: op.getPrime();
		break;
		case 2: op.getEven();
		break;
		case 3: op.getOdd();
		break;
		default:
			System.out.println("Invalid option");
			sc.close();
		}
	}
	

}
