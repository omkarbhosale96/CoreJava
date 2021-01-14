package transpose;

import java.util.Scanner;

public class Transpose {
	
	int length;
	int[][] a=new int[3][3];
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
	void getTranspose()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[j][i]+" ");	
			}
			System.out.println();
		}
	}

}
