package division;

public class Demo {

	public int division(int divident,int divisor)
	{
		if(divisor==0)
		{
			throw new ArithmeticException("Divisor cannot be zero");
		}
		int result=divident/divisor;
		return result;
	}
}
