package calculator;

import java.util.Scanner;

public class MenuDriven {

	
	Calculator c=new Calculator();
	
	void getMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition, 2.Substraction, 3.Multiplication, 4.Division");
		System.out.println("Enter an option");
		int option=sc.nextInt();
		sc.close();
		switch(option)
		{
		case 1: System.out.println(c.addition(4, 2));
			break;
		case 2: System.out.println(c.substraction(4, 2));
			break;
		case 3: System.out.println(c.multiplication(4, 2));
			break;
		case 4: System.out.println(c.division(4, 2));
			break;
		default: System.out.println("Invalid operation");
		}
		
	}
}
