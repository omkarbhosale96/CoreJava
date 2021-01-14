package vehicle;

public class Vehicle {
	
	String name,station;
	int model,price;
	
	Vehicle()
	{
		
	}
	void displayData()
	{
		System.out.println("Name:"+name);
		System.out.println("Model no:"+model);
		System.out.println("Service station:"+station);
		System.out.println("Price:"+price);
	}

}
