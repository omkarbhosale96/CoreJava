package diffBetSmallestAndLargest;

public class Difference {

	
	int a[]= {2,9,2,1,1,8,5,4};
	
	void getDifference()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[0]+" "+a[a.length-1]);
		System.out.println(a[a.length-1]-a[0]);
	}
}
