package temperature;

public class Temperature {

	
	int cel=23;
	int far=75;
		
	void toCelsius()
	{
		 cel=(32*far-32)*5/9;
		System.out.println("Temperature in Celsius:"+cel);
	}
	void toFahrenheit()
	{
		far=(cel*9/5)+32;
		far=far/32;
		System.out.println("Temperature in Fahrenheit:"+far);
	}
}
