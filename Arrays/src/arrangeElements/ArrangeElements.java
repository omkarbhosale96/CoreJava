package arrangeElements;

import java.util.Scanner;

public class ArrangeElements {

	int length;
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
	void arrangeElements()
	{
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				b[count++]=a[i];
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				b[count++]=a[i];
			}
		}
		
		for(int p:b)
			System.out.print(p+" ");
	}
}
