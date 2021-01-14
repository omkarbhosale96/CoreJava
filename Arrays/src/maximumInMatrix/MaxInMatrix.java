package maximumInMatrix;

import java.util.Scanner;

public class MaxInMatrix {

	int[][] a=new int[3][3];
	int max=Integer.MIN_VALUE;
	int[][] a()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	void getMax()
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("Maximum:"+max);
	}
}
