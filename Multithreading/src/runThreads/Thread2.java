package runThreads;

public class Thread2 extends Thread{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("T2");
		}
	}
}
