package numberPattern8;

public class NumberPattern8 {
	
	void getPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}

}
