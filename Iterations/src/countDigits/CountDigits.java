package countDigits;

import java.util.Scanner;

public class CountDigits {

	void getDigits()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int count=0;
		while(number>0)
		{
			number=number/10;
			count++;
		}
		System.out.println("Number of digits:"+count);
		sc.close();
	}
}
