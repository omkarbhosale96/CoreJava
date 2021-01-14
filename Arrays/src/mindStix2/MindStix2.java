package mindStix2;

public class MindStix2 {

	
	char[] a= {'a','b','c','d'};
	char[] b= {'w','x','y','z'};
	char[] c;
	
	void getArray()
	{
		
		c=new char[a.length+b.length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i]=a[j];
				System.out.print(c[i]+" ");
				c[i]=b[j];
				System.out.print(c[i]+" ");
			
			}
			break;
		}
		
	}
}
