package uniqueTriplets;

public class UniqueTriplets {

	int a[]= {1,3,0,-2,-3,6,5,-4};
	
	void getTriplet()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==2)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}
}
