package miniCalc;

public class Calculator {

	float a;
	float b;
	float result;
	 Calculator(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void sum()
	{
		result=a+b;
		System.out.println("Sum is:"+result);
	}
	void sub()
	{
		result=a-b;
		System.out.println("Substraction is:"+result);
	}
	void mul() 
	{
		result=a*b;
		System.out.println("Multiplication is:"+result);
	}
	void div()
	{
		result=a/b;
		System.out.println("Division is:"+result);
	}
			
}
