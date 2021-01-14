package itemSellBuy;

public class Sell extends Thread{
	Item i;
	public Sell(Item i)
	{
		this.i=i;
	}
	public void run()
	{
		for(int j=0;j<10;j++)
		{
		i.sell();
		}
	}
}
