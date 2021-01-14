package runtimeStackMechanism;

public class ClassA {

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
		
			int b=10/0;
			
		System.out.println("End C");
	}
}
