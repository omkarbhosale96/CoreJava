package biscuitStore;

public class Th2 extends Thread{
	Store s1;
	Th2(Store s)
	{
		s1=s;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		s1.consume();
		}
	}
}
