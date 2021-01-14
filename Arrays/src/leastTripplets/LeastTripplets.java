package leastTripplets;

public class LeastTripplets {

	static int[] a= {3,7,90,20,5,50,40};
	static int k=3;
	public static void main(String[] args) {
		
		int minAvg=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<a.length-k+1;i++)
		{
			int sum=giveSum(i,k);
			int avg=sum/k;
			if(avg<minAvg)
			{
				minAvg=avg;
				index=i;
			}
		}
		System.out.println(minAvg+" "+index);

	}
	private static int giveSum(int i,int k) {
		if(k==0)
			return 0;
		else
		return a[i]+giveSum(i+1,k-1);
	}

}
