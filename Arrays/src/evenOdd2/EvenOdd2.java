package evenOdd2;

public class EvenOdd2 {

	int[] a= {1,2,3,4,5,6,7,8,9};
	
	void getEvenOdd()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]%2!=0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int p:a)
			System.out.print(p+" ");
	}
}
