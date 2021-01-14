package duplicateElements;

import java.util.Scanner;

public class DuplicateElements {

	int[] a=new int[5];
	int count;
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
	void removeDuplicate()
	{
		 count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
			
		}
		System.out.println(count);
		int nb=a.length-count;
		int[] b=new int[nb];
		count=0;
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<nb;j++)
			{
				if(a[i]==b[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				b[count++]=a[i];
			}
		}
		for(int p:b)
			System.out.print(p+" ");
	}
}
