package copyAnArray;

import java.util.Scanner;

public class CopyAnArray {

	int[] a=new int[5];
	int[] b=new int[a.length];
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
	void copyArray()
	{
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int p:b)
			System.out.print(p+" ");
	}
}
