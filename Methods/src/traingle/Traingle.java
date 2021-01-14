package traingle;

public class Traingle {
	
	int side1,side2,side3;
	
	Traingle(int side1,int side2,int side3) 
	{
		this.side1=side1;
		this.side2=side2;
		this.side2=side3;
		
		
	}
	void trainglePerimeter()
	{
		int perimeter=side1+side2+side3;
		System.out.println("Perimeter is:"+perimeter);
	}
	void traingleArea()
	{
		int s=(side1+side2+side3)/2;
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area is:"+area);
	}
	

}
