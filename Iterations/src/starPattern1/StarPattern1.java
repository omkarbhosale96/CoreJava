package starPattern1;

public class StarPattern1 {
	
	void getPattern()
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
