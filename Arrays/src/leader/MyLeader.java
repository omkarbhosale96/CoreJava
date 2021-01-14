package leader;

public class MyLeader {

	public static void main(String[] args) {
		int a[]= {92,24,10,35,78,12,11};
		int max=a[a.length-1];
		System.out.println(max);
		for(int i=a.length-1;i>=0;i--)
		{
			
			if(a[i]>max)
			{
				max=a[i];
				System.out.println(max);
			}
		}

	}

}
