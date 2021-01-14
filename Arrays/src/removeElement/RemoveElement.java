package removeElement;

import java.util.Scanner;

public class RemoveElement {

	int[] a=new int[5];
	int count;
	int element;
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
	void findElement()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to remove");
		element=sc.nextInt();
		 count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				count++;
			}
		}
	}
	void removeElement()
	{
		int nb=5-count;
		int[] b=new int[nb];
		count=0;
		for(int i=0;i<5;i++)
		{
			if(a[i]!=element)
			{
				b[count++]=a[i];
			}
		}
		for(int i=0;i<nb;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
