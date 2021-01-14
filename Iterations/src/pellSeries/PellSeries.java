package pellSeries;

public class PellSeries {
	
	void getSeries()
	{
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<=17;i++)
		{
			int c=2*b+a;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}
