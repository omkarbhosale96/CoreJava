package leader;

public class Leader {

	int a[]= {92,24,10,35,78,12,11};
	
	
	void getLeader()
	{
		for(int i=0;i<a.length;i++)
		{
			boolean flag=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(a[i]);
			
		}
	}
}
