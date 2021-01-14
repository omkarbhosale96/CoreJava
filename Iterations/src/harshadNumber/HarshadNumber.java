package harshadNumber;

public class HarshadNumber {
	int number;
	void getNumber(int number)
	{
		this.number=number;
		int temp=number;
		int result=0;
		while(temp>0)
		{
			int rem=temp%10;
			 result=result+rem;
			 temp=temp/10;
		}
		
		if(number%result==0)
		{
			System.out.println("Harshad hai");
		}
		else
		{
			System.out.println("Harshad nahi hai");
		}
	}

}
