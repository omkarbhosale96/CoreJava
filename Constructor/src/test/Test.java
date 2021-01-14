package test;

public class Test {
	
	int number;
	Test(int number)
	{
		this.number=number;
		
	}
	void EvenOdd()
	{
		if(number%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
	void getFactorial()
	{
		int i=1;
		int result=1;
		do
		{
			result=result*i;
			i++;
		}
		while(i<=number);
		System.out.println("Factorial is:"+result);
	}
	void sumOfDigits()
	{
		int result=0;
		int temp=number;
		while(temp>0)
		{
			int rem=temp%10;
			result=result+rem;
			temp=temp/10;
		}
		System.out.println("The sum of digits:"+result);
	}

}
