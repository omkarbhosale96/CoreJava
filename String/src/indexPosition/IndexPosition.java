package indexPosition;

public class IndexPosition {

	public static void main(String[] args) {
		
		String a="The Avengers Infinity war";
		char[] b=a.toCharArray();
		int m=3;
		int n=4;
		
		for(int i=0;i<b.length;i++)
		{
				if(i==m || i==n)
				{
					if(i==m)
					{
						m=m+5;
					}
					if(i==n)
					{
						n=n+5;
					}
					continue;
				}
				else
				System.out.print(b[i]);
			
		}
		
		
	}

}
