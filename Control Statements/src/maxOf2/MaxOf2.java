package maxOf2;

public class MaxOf2 {

	int a;
	int b;
	void maxMin(int a,int b)
	{
		this.a=a;
		this.b=b;
		if(a>b)
			System.out.println("Max:"+a+" Min:"+b);
		else
			System.out.println("Max:"+b+" Min:"+a);
	}
}
