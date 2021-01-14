package yield;

public class MainTh extends Thread{

	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Main");
			Thread.yield();
		}
	}
}
