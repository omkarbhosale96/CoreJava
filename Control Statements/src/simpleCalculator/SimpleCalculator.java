package simpleCalculator;

import java.util.Scanner;

public class SimpleCalculator extends Operations {
	
	void getCal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Enter operation");
		char c=sc.next().charAt(0);
		
		switch(c)
		{
		case '+': sum();
			break;
		case '-': sub();
			break;
		case '*': mul();
			break;
		case '/': div();
			break;
			default:
				System.out.println("Invalid operation");
				sc.close();
		}
	}
}
