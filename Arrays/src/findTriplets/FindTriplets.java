package findTriplets;

public class FindTriplets {
	int[] a= {5,1,3,4,7};
	int sum=12;
	
	void getTriplets()
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]<sum)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						count++;
					}
					
				}
			}
		}
		System.out.println("Total triplets:"+count);
	}
}
