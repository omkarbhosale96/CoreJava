package checkPrimeNumber;

import java.util.Scanner;

public class CheckPrimeNumber {
	
	void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=number-1;i++)
		{
			if(number%i==0)
			{
				flag=true;
				
			}
		}
		if(!flag)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
		sc.close();
	}

}
