package menuDriven;

public class OperationsNum {
	
	void getPrime()
	{
		boolean flag=false;
		for(int i=1;i<=100;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
				else
				{
					flag=false;
				}
			}
			if(!flag)
				System.out.println(i);
		}
	}
	void getEven()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	void getOdd()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

}
