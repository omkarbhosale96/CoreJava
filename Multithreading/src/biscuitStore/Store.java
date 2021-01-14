package biscuitStore;

public class Store {
	int biscuit=0;
	public synchronized void produce()
	{
		biscuit++;
		System.out.println(biscuit);
		
		if(biscuit>=5)
		{
			notify();
		}
	}
	public synchronized void consume()
	{
		if(biscuit<5)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		biscuit--;
		System.out.println(biscuit);
		
	}
}
