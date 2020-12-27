package evenOdd;

public class EvenOdd {
	
	int number;
	
	void checkNum(int number)
	{
		this.number=number;
		
		if(number%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}

}
