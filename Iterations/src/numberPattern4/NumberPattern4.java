package numberPattern4;

public class NumberPattern4 {

	
	void getPattern()
	{
		int a=1;
		for(int i=1;i<=5;i++)
		{
			int b=a;
			for(int j=1;j<=i;j++)
			{
				System.out.print(b);
				b--;
			}
			a++;
			System.out.println();
	
		}
	}
}
