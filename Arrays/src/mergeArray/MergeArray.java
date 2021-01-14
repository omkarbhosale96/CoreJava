package mergeArray;

public class MergeArray {

	
	int[] a= {5,0,1,7,5,7,8,2};
	int[] b= {3,2,1,7};
	
	void merge()
	{
		int[] c=new int[a.length+b.length];
		int count=0;
		
		int n=0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
				c[count++]=a[i];
			else 
				c[count++]=b[n++];
		}
		
		for(int p:c)
			System.out.print(p+" ");
	}
}
