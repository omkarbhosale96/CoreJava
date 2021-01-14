package additionOfMatrix;

public class AdditionOfMatrix {

	int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
	int[][] b= {{1,2,3},{4,5,6},{7,8,9}};
	int[][] c=new int[a.length][b.length];
	
	void getSum()
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int[] p:c)
		{
			for(int q:p)
			{
				System.out.print(q+" ");
			}
			System.out.println();
		}
	}
}
