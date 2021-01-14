package uniquePairs;

import java.util.Scanner;

public class UniquePairs {

	int[] a=new int[5];
	int sum;
	float avg;
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
	void getPairs()
	{
		int count=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[i]+" "+a[j]);
			count++;
		}
	}
	System.out.println("Total pairs:"+count);
}

}
