package getEvenOdd;

import java.util.Scanner;

public class GetEvenOdd {
	
	void getNumbers()
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				System.out.println();
				
			}
			else
			{
				System.out.print(i+" ");
				
			}
		
		}
		sc.close();
	}

}
