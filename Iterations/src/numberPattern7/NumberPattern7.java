package numberPattern7;

public class NumberPattern7 {
	void getPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0 && j%2!=0)
					System.out.print(1);
				else if(i%2==0 && j%2==0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
	
		}
	}
}
