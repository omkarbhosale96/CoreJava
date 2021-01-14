package numbers;

public class Numbers {
	
	void getNumbers()
	{
		int p=0;
		int y=0;
		int py=0;
		for(int i=33;i<=999;i++)
		{
			 if(i%3==0 && i%5==0)
			{
				System.out.println("PINK YELLOW");
				py++;
			}
			 else if(i%3==0)
			{
				System.out.println("PINK");
				p++;
			}
			else if(i%5==0)
			{
				System.out.println("YELLOW");
				y++;
			}
			
		}
		System.out.println("PINK:"+p);
		System.out.println("YELLOW:"+y);
		System.out.println("PINK YELLOW:"+py);
	}

}
