package division;

public class MainClass {

	public static void main(String[] args) {
		Demo d=new Demo();
		int result=0;
		try {
		result=d.division(10, 0);
		}
		catch(ArithmeticException ar)
		{
			System.out.println("Arithmetic Exception is thrown");
			System.out.println(ar.getMessage());
		}
		finally
		{
			System.out.println("The result is "+result);
		}

	}

}
