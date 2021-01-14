package positiveNegative;

import java.util.Scanner;

public class PositiveNegative {

	
	int a[]=new int[10];
	void getArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	void getCount()
	{
		int evenCnt=0,oddCnt=0,pCnt=0,nCnt=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2==0)
				evenCnt++;
			else 
				oddCnt++;
			 
			if(a[i]>0)
				 pCnt++;
			 else if(a[i]<0)
				 nCnt++;
		}
		System.out.println("Even:"+evenCnt+" Odd:"+oddCnt+" Positive:"+pCnt+" Negative:"+nCnt);
	}
}
