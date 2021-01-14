package reverseAnArray2;

import java.util.Scanner;

	public class ReverseAnArray2 {
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
			a[i]=a[i]+a[5-i-1];
			a[5-i-1]=a[i]-a[5-i-1];
			a[i]=a[i]-a[5-i-1];
		}
		for(int p:a)
			System.out.print(p+" ");
	}
}
