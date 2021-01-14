package sumOfDigits;

import java.util.Scanner;

public class SumOfDigits {
	
	void getSum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int result=0,temp;
		while(number>0)
		{
			temp=number%10;
			result=result+temp;
			number=number/10;
			
		}
		System.out.println("Sum is:"+result);
		sc.close();
	}

}
