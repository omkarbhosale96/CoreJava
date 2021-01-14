package selectionSort;

import java.util.Scanner;

public class SelectionSort {

	int length;
	int[] a=new int[5];
	int[] a()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	void selectionSort()
	{
		for(int i=0;i<a.length;i++)
		{
			int max=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[max]<a[j])
				{
					max=j;
				}
			}
			int temp=a[max];
			a[max]=a[i];
			a[i]=temp;
		}
	}
	void print()
	{
		for(int p:a)
			System.out.print(p+" ");
	}
}
