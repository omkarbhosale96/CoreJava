package vehicle;

public class MyBike {

	public static void main(String[] args) {
		Bike b=new Bike();
		
		b.discountRate=8;
		b.model=2020;
		b.name="Honda Shine";
		b.price=70000;
		b.station="Sai Honda Kolhapur";
		b.displayData();
		b.discount();

	}

}
