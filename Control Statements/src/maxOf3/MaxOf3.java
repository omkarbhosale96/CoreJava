package maxOf3;

public class MaxOf3 {
	
	int a;
	int b;
	int c;
	int max;
	void getMax(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
		if(a>b && a>c)
			max=a;
		else if(b>a && b>c)
			max=b;
		else 
			max=c;
		System.out.println("Max is:"+max);
	}

}
