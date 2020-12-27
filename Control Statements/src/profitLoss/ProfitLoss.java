package profitLoss;

import java.util.Scanner;

public class ProfitLoss {

	int bprice;
	int sprice;
	
	void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter buying price");
		bprice=sc.nextInt();
		System.out.println("Enter selling price");
		sprice=sc.nextInt();
		if(bprice<sprice)
			System.out.println("Profit of:"+(sprice-bprice));
		else if(bprice>sprice)
			System.out.println("Loss of:"+(bprice-sprice));
		else
			System.out.println("No profit no loss");
		sc.close();
	}
}
