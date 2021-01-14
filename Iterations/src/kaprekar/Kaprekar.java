package kaprekar;

public class Kaprekar {
	
	int a;
	void check(int a)
	{
		this.a=a;
		int b=a*a;
		
		int count=0;
		while(b>0)
		{
			b=b/10;
			count++;
			
		}
		b=a*a;
		if(count%2!=0)
			count++;
		
		count=count/2;
		int c=(int) Math.pow(10, count);
		
		
		if(a==(b/c + b%c))
			System.out.println("Kaprekar number");
		else 
			System.out.println("Not kaprekar");
	}

}
