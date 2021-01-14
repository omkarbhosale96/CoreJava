package averageOfInnerElements;

public class AverageInner {

	int[][] a= {{1,9,3,5},
				{4,1,6,0},
				{4,8,2,2},
				{0,3,7,8}};
	
	void getAvg()
	{
		int sum=0;
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i!=0 && i!=a.length-1 && j!=0 && j!=a[i].length-1)
				{
					sum=sum+a[i][j];
					count++;
				}
			}
		}
		System.out.println(sum);
		System.out.println("Average:"+(sum/count));
	}
}
