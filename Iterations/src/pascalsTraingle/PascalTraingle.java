package pascalsTraingle;

public class PascalTraingle {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(give(i,j)+" ");
			}
			System.out.println();
		}

	}

	 static int give(int i, int j) {
		if(j==1 || i==j)
			return 1;
		else
			return give((i-1),j)+give(i-1,j-1);
	}

}
