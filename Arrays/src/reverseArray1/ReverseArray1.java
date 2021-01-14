package reverseArray1;

import java.util.Scanner;

public class ReverseArray1 {

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
	void reverseArray()
	{
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[5-1-i];
			a[5-1-i]=temp;
		}
		for(int p:a)
			System.out.print(p+" ");
	}
}
