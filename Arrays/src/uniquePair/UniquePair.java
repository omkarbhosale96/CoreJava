package uniquePair;

import java.util.Arrays;

public class UniquePair {

	int[] a= {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
	int sum=7;
	
	void getPairs()
	{
		Arrays.sort(a);
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			if(a[i]+a[j]==sum)
			{
				System.out.println(a[i]+" "+a[j]);
				i++;
				j--;
			}
			else if(a[i]+a[j]<sum)
				i++;
			else
				j--;
		}
	}
}
