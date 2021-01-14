package replaceElements;

public class ReplaceElement {

	int[] a= {3,4,0,2,0,0,8,3,0};
	
	void replace()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				a[i]=1;
		}
		for(int p:a)
			System.out.print(p+" ");
	}
}
