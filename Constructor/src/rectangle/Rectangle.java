package rectangle;

public class Rectangle {

	
	int length,width;
	
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	void rectanglePerimeter()
	{
		System.out.println("Perimeter is:"+(2*length+2*width));
	}
	void rectangleArea()
	{
		System.out.println("Area is:"+(length*width));
	}
}
