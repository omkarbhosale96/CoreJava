package itemSellBuy;

public class Buy extends Thread{

	Item i;
	public Buy(Item i)
	{
		this.i=i;
	}
	public void run()
	{
		for(int j=0;j<10;j++)
		{
		i.buy();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
