package numberPattern1;

public class NumberPattern1 {
	
	void getPattern()
	{
		int a=1;
		for(int i=1;i<=5-1;i++)
		{
			int b=a;
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(b+" ");
				b++;
			}
			a++;
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			int c=a;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			a--;
			System.out.println();
		}
	}

}
