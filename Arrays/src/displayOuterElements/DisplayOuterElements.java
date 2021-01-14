package displayOuterElements;

public class DisplayOuterElements {

	int[][] a= {{2,0,4,1,2,8},
				{5,4,9,1,9,2},
				{7,0,0,2,6,1},
				{6,1,7,8,3,9},
				{2,0,1,3,1,6},
				{5,5,7,2,1,0}};
	
	void getOuterElements()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==0 || j==0 || i==a.length-1 || j==a.length-1)
				{
					System.out.print(a[i][j]+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
