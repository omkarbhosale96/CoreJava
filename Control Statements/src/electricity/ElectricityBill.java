package electricity;

import java.util.Scanner;

public class ElectricityBill {
	
	float bill;
	void calcBill()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units");
		int unit=sc.nextInt();
		
		if(unit<=50)
		{
			bill=(float) (0.50*unit);
		}
		else if(unit<=150)
		{
			bill=(float) ((unit-50)*0.75 + 50*0.50);
		}
		else if(unit>150 && unit<=250)
		{
			bill=(float) ((unit-150)*1.2 + (150-50)*0.75 + 50*0.50);
		}
		else
		{
			bill=(float) ((float) (unit-250)*1.5 + (250-150)*1.2 +(150-50)*0.75 + 50*0.50);
		}
		System.out.println("Total bill:"+(bill+bill*0.2));
		sc.close();
	}

}
