package tableOfNumber;

import java.util.Scanner;

public class TableOfNumber {
	
	void getTable()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int result=number*i;
			System.out.println(result);
		}
		sc.close();
	}

}
