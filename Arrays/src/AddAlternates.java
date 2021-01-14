
public class AddAlternates {

	public static void main(String[] args) {
		char a[]= {'a','b','c','d','e','f','g','h','i'};
		char b[]= {'p','q','r','s'};
		
		char c[]=new char[a.length+b.length];
		int count=0;
		if(a.length>b.length)
		{
			for(int i=0;i<b.length;i++)
			{
				c[count++]=a[i];
				c[count++]=b[i];

			}
			for(int i=b.length;i<a.length;i++)
			{
				c[count++]=a[i];
			}
			
		}
		if(b.length>a.length)
		{
			for(int i=0;i<a.length;i++)
			{
				c[count++]=a[i];
				c[count++]=b[i];
			}
			for(int i=a.length;i<b.length;i++)
			{
				
				c[count++]=b[i];
			}
			
			
		}
			
		for(char p:c)
			System.out.print(p+" ");

	}

}
