package rectangle;

public class Rectangle {
	int length;
	int width;
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	void perimeter()
	{
		System.out.println("Perimeter is:"+(2*length+2*width));
	}
	void area()
	{
		System.out.println("Area is:"+length*width);
	}

}
