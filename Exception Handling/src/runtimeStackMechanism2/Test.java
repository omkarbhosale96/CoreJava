package runtimeStackMechanism2;

public class Test {

	void classA()
	{
		System.out.println("Start A");
		classB();
		System.out.println("End A");
	}
	void classB()
	{
		System.out.println("Start B");
		classC();
		System.out.println("End B");
	}
	void classC()
	{
		System.out.println("Start C");
		try {
		int a=10/0;
		}catch(ArithmeticException e) {}
		System.out.println("End C");
	}
}
