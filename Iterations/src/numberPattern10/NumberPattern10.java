package numberPattern10;

public class NumberPattern10 {
	
	void getPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(give(i,j));
			}
			System.out.println();
		}
	}

	private int give(int i, int j) {
		if(j==1 || i==j)
			return 1;
		else
		return give((i-1),j)+give((i-1),(j-1));
	}

}
