package itemSellBuy;

public class Item {
	int product=0;
	boolean flag=false;
	
	public synchronized void buy()
	{
		if(flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		product++;
		System.out.println(product);
		flag=true;
		notify();
		
	}
	public synchronized void sell()
	{
		if(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		product--;
		System.out.println(product);
		flag=false;
		notify();
	}

}
