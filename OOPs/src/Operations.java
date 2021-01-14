import java.util.Scanner;

public class Operations {
	
	int a,b;
	
	void getInput()
	{
		System.out.println("WELCOME");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		sc.close();
		
		CompanyMenu obj=new CompanyMenu();
		obj.getMenu();
		
		
	}
	
	
	void sum()
	{
		System.out.println("The result is:"+(a+b));
	}
	
	void sub()
	{
		System.out.println("The result is:"+(a-b));
	}
	
	void mul()
	{
		System.out.println("The result is:"+(a*b));
	}
	

}
