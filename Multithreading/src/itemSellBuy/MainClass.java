package itemSellBuy;

public class MainClass {

	public static void main(String[] args) {
		Item i=new Item();
		Sell s=new Sell(i);
		Buy b=new Buy(i);
		s.start();
		b.start();

	}

}
