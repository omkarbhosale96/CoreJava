package factorial;

import java.util.Scanner;

public class Factorial {
	
	void getFactorial()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int result=1;
		for(int i=1;i<=number;i++)
		{
			result=result*i;
		}
		System.out.println(result);
		sc.close();
	}

}
