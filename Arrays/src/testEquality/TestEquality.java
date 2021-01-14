package testEquality;

public class TestEquality {

	int a[]= {7,9,0,3,2,1,6};
	int b[]= {7,9,0,3,2,1,6};
	
	void check()
	{
		if(a.length==b.length)
		{
			boolean flag=false;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					flag=true;
					break;
				}
				
			}
			if(!flag)
				System.out.println("Equals");
			else
				System.out.println("Equal by length but not by elements");
		}
		else
			System.out.println("Not equal in length");
	}
}
