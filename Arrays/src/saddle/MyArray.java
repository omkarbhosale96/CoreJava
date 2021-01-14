package saddle;

public class MyArray {

	public static void main(String[] args) {
		int a[][]= {{6,3,1},
					{9,7,8},
					{2,4,5}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				boolean smallest=true;
				boolean greatest=true;
				for(int k=0;k<a.length;k++)
				{
					if(a[i][k]<a[i][j])
					{
						smallest=false;
						break;
					}
				}
				for(int k=0;k<a.length;k++)
				{
					if(a[k][j]>a[i][j])
					{
						greatest=false;
						break;
					}
				}
				if(smallest && greatest)
				{
					System.out.println(a[i][j]);
				}
			}
		}

	}

}
