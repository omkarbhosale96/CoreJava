package square;

public class Traingle extends Rectangle {

	int side1,side2,side3;
	
	
	void area(int side1,int side2,int side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		float p=(float)(side1+side2+side3)/2;
		float area=(float) Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		System.out.println("Area of traingle:"+area);
	}
}
