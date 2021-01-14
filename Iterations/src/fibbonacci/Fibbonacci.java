package fibbonacci;

public class Fibbonacci {

	int a=0;
	int b=1;
	void getSeries()
	{
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		while(a<20)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
