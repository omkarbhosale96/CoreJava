package biscuitStore;

public class Th1 extends Thread{
	Store s1;
	Th1(Store s)
	{
		s1=s;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		s1.produce();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
