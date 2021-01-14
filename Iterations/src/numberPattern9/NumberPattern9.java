package numberPattern9;

public class NumberPattern9 {
	
	void getPattern()
	{
		int a=1;
		for(int i=1;i<=4;i++)
		{
			int b=a;
			for(int j=1;j<=i;j++)
			{
				System.out.print(b);
				b--;
			}
			int c=2;
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(c);
				c++;
			}
			a++;
			System.out.println();
				
		}
	}


}
