package findIndex;

import java.util.Scanner;

public class FindIndex {

	int[] a=new int[5];
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
	void getIndex(int element)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("Index is:"+i);
				break;
			}
		}
	}
}
