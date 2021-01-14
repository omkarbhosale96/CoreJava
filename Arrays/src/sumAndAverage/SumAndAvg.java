package sumAndAverage;

import java.util.Scanner;

public class SumAndAvg {

	int[] a=new int[5];
	int sum;
	float avg;
	int[] a()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	int sum()
	{
		 sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		return sum;
	}
	float avg()
	{
		 avg=sum/a.length;
		return avg;
		
	}
}
