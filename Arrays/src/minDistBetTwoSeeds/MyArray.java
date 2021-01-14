package minDistBetTwoSeeds;

public class MyArray {

	public static void main(String[] args) {
		int[] a= {10,77,30,11,34,20,78,30,61,30,17,56,31,20};
		int m=30;
		int n=20;
		int min=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==m && a[j]==n)
				{
					if(i>j && i-j<min)
						min=i-j;
					if(j>i && j-i<min)
						min=j-i;
				}
			}
		}
		System.out.println(min);
	}

}
