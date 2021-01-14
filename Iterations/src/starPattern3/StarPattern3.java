package starPattern3;

public class StarPattern3 {
	
	void getPattern()
	{
		for(int i=1;i<=9;i=i+2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=9;i=i+2)
		{
			for(int j=1;j<9-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
