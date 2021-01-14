package yield;

public class SubTh extends Thread{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Sub Thread");
		}
	}
}
