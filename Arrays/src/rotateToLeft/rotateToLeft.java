package rotateToLeft;

public class rotateToLeft {

	int a[]= {0,1,2,3,4,5,6};
	
	void rotate()
	{
		int i=0;
		int j=i+1;
		int temp=a[0];
		while(i<a.length-1)
		{
			a[i]=a[j];
			i++;
			j++;
		}
		a[a.length-1]=temp;
		for(int p:a)
			System.out.print(p+" ");
	}
}
