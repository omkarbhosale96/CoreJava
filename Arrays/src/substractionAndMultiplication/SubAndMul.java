package substractionAndMultiplication;

import java.util.Scanner;

public class SubAndMul {
	
	int[][] a;
	int[][] b;
	
	void getArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Enter elements of first array");
		a=new int[x][y];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter size of second array");
		int p=sc.nextInt();
		int q=sc.nextInt();
		System.out.println("Enter elements of second array");
		b=new int[p][q];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
	}
	void getSub()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=a[i][j]-b[i][j];
			}
		}
		for(int[] p:a)
		{
			for(int q:p)
				System.out.print(q+" ");
			System.out.println();
		}
	}

}
