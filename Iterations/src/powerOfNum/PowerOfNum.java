package powerOfNum;

public class PowerOfNum {

	
	int number;
	int pow=0;
	int result;
	void getPower(int number)
	{
		this.number=number;
		while(number>pow)
		{

			result=number+number*pow;
			pow++;
			
		}
		System.out.println(result);
	}
}
