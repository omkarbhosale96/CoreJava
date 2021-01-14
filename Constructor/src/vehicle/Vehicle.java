package vehicle;

public class Vehicle {

	
	String color="White";
	int wheelCnt=4,gearCnt=5;
	
	Vehicle(String color,int gearCnt)
	{
		this();
		this.color=color;
		this.gearCnt=gearCnt;
		System.out.println("Color:"+color);
		System.out.println("Gears:"+gearCnt);
		
	}
	Vehicle()
	{
		System.out.println("Color:"+color);
		System.out.println("Wheels:"+wheelCnt);
		System.out.println("Gears:"+gearCnt);
	}
	

	
}
