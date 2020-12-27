package positiveNegative;

public class PositiveNegative {
	
	int number;
	
	void getChecked(int number)
	{
		this.number=number;
		if(number>0)
			System.out.println("Positive number");
		else if(number<0)
			System.out.println("Negative number");
		else
			System.out.println("Zero");
	}

}
