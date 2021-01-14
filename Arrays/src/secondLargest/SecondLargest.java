package secondLargest;

import java.util.Scanner;

public class SecondLargest {

	int[] a=new int[5];
	int max=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	
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

	
	
	void getSecLarg()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max2=max;
				max=a[i];
			}
			else if(a[i]>max2 && max!=a[i])
			{
				max2=a[i];
			}
			
		}
		System.out.println("Largest:"+max);
		System.out.println("Second largest:"+max2);

	}
}

