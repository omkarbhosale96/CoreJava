package vehicle;

public class Bike extends Vehicle {

	
	int discountRate;
	Bike()
	{
		
	}
	void display()
	{
		System.out.println("Discount Rate:"+discountRate);
	}
	void discount()
	{
		float discount=price*discountRate/100;
		System.out.println("Discount:"+discount);
	}
}
