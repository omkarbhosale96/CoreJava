package binarySearch;

import java.util.Scanner;

public class BinarySearch {
	
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
	void binarySearch()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element");
		element =sc.nextInt();
		int min=0;
		int max=a.length-1;
		int mid;
		
		while(min<=max)
		{
			
			mid=(min+max)/2;
			if(a[mid]==element)
			{
				System.out.println("Element fount at:"+mid);
				break;
			}
			else if(a[mid]<element)
				min=mid+1;
			else if(a[mid]>element)
				max=mid-1;
			else
			{
					System.out.println("Element not found");
					break;
				
			}
				
		}
		
	}
}
